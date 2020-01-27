package com.Matyskin;

import com.Matyskin.screen.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    protected Screen screen;
    protected ATM atm;
    protected BankCard bankCard;
    private DataBase dataBase;

    public double getAtmBalance() {
        return atm.getBalanceATM();
    }                      // getter
    public void setAtmBalance(double atmBalance) {
        atm.setBalanceATM(atmBalance);
    }    // setter
    public double getCardBalance() {
        return dataBase.getCardBalance(bankCard.getNumberCard());
    }                             // getter
    public void setCardBalance(double cardBalance) {
        dataBase.setCardBalance(bankCard.getNumberCard(), cardBalance);
    } // setter
    public String getNameATM() {return atm.getNameATM(); }                             // getter
    public int getCardPinCode() {return dataBase.getPinCode(bankCard.getNumberCard()); }                   // getter

    public Controller(){
        this.screen = new PinCodeInputScreen();
        this.atm = new ATM();
        this.bankCard = new BankCard();
        this.dataBase = new DataBase();
    }                      // constructor

    public void app() {                                     // enter point
        while (true) {
            this.action(screen);
        }
    }

    public void action(Screen screen) {                     // chose action which depend on Screen
        if (screen instanceof InputMoneyScreen) {
            actionInputMoneyScreen();
        } else if (screen instanceof PinCodeInputScreen) {
            actionPinCodeInputScreen();
        } else if (screen instanceof SelectActionScreen){
            actionSelectActionScreen();
        } else if (screen instanceof ReturnCardScreen) {
            actionReturnCardScreen();
        } else if (screen instanceof ShowBalanceScreen) {
            actionShowBalanceScreen();
        }
        else {
            System.out.println("It's method action");
            System.exit(2);
        }
    }

    public void actionInputMoneyScreen() {
        double doubleUserInput;
        String userInput = "";

        while (true) {
            screen.showUserInterface();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                userInput = reader.readLine();
            } catch (IOException e) {
                System.out.println("We have caught exception in : " + e.getClass());
            }
            if (userInput.equals("r") || userInput.equals("t") || isNumeric(userInput)) {
                if (userInput.equals("r")) {
                    screen = new SelectActionScreen();
                    break;
                }
                if (userInput.equals("t")) {
                    screen = new ReturnCardScreen();
                    break;
                }
                doubleUserInput = Double.parseDouble(userInput);
                if (doubleUserInput <= getCardBalance() && doubleUserInput <= getAtmBalance()) {
                    setCardBalance(getCardBalance() - doubleUserInput);
                    setAtmBalance(getAtmBalance() - doubleUserInput);
                    System.out.println("Please, take your " + doubleUserInput + " dollars.");
                } else if (doubleUserInput >= getCardBalance()) {
                    System.out.println("You aren't enough money on your card.");
                } else if (doubleUserInput >= getAtmBalance()) {
                    System.out.println("The ATM aren't enough money.");
                }
            } else {
                screen.showUserInterface(userInput);
            }
        }
    }              // It's for InputMoneyScreen

    public static boolean isNumeric(String userInput) {
        try {
            Double.parseDouble(userInput);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    } // It's for actionInputMoneyScreen

    int pinCodeInputTry = 0;                                // It's for actionPinCodeInputTry

    public void actionPinCodeInputScreen(){
        int inputPinCode = 0;

        System.out.println("Welcome to " + getNameATM() + ".");
        if (inputPinCode == 3) {
            System.out.println("Your card is blocked. Please call your bank.");
            System.exit(0);
        }
        while (pinCodeInputTry != 3){
            screen.showUserInterface(String.valueOf(pinCodeInputTry));
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                inputPinCode = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("We have caught exception in : " + e.getClass());
            }
            if (inputPinCode != getCardPinCode()) {
                pinCodeInputTry++;
                System.out.println("Your pin code is wrong.");
            }
            if (inputPinCode == getCardPinCode()) {
                screen = new SelectActionScreen();
                break;
            }
        }
    }             // It's for PinCodeInputScreen

    public void actionSelectActionScreen() {
        while (true) {
            screen.showUserInterface();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choice = null;
            try {
                choice = reader.readLine();
            } catch (IOException e) {
                System.out.println("We have caught exception in : " + e.getClass());
            }
            if (choice.equals("g") || choice.equals("c") || choice.equals("t")) {
                if (choice.equals("g")) {
                    screen = new ShowBalanceScreen();
                    break;
                }
                if (choice.equals("c")) {
                    screen = new InputMoneyScreen();
                    break;
                }
                if (choice.equals("t")) {
                    screen = new ReturnCardScreen();
                    break;
                }
            } else {
                screen.showUserInterface(choice);
            }
        }
    }            // It's for SelectActionScreen

    public void actionReturnCardScreen() {
        screen.showUserInterface();
        System.exit(0);
    }              // It's for ReturnCardScreen

    public void actionShowBalanceScreen() {
        String userInput = "";
        System.out.println("Your money count is : " + getCardBalance() + "" +
                "\nATM's money count is : " + getAtmBalance());
        screen.showUserInterface();

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                userInput = reader.readLine();
            } catch (IOException e) {
                System.out.println("We have caught exception in : " + e.getClass());
            }
            userInput = userInput.toLowerCase();
            if (userInput.equals("r") || userInput.equals("t")) {
                if (userInput.equals("r")) {
                    screen = new SelectActionScreen();
                    break;
                }
                if (userInput.equals("t")) {
                    screen = new ReturnCardScreen();
                    break;
                }
            } else {
                screen.showUserInterface(userInput);
            }
        }
    }             // It's for ShowBalanceScreen
}
