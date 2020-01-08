package com.screen;

import com.BankCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputMoneyScreen extends Screen {

    public InputMoneyScreen(BankCard bankCard, Screen screen) {
        super(bankCard, screen.getAtm());
    }

    @Override
    public void showUserInterface(String userInput) {
        System.out.println("You have entered : \"" + userInput + "\". " +
                "\nIt's wrong input.");
    }

    @Override
    public void showUserInterface() {
        System.out.println("__________________________________________" +
                "\n|Enter SUM to get cash                   |" +
                "\n|Enter \"r\" to return to the previous menu|" +
                "\n|Enter \"t\" to take card                  |" +
                "\n|Please make your choice :               |" +
                "\n|                 .  .  .  .             |" +
                "\n|________________________________________|");
    }

    @Override
    public void work() {
        double doubleUserInput;
        String userInput = "";

        while (true) {
            showUserInterface();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                userInput = reader.readLine();
            } catch (IOException e) {
                System.out.println("We have caught exception in : " + e.getClass());
            }
            if (userInput.equals("r") || userInput.equals("t") || isNumeric(userInput)) {
                if (userInput.equals("r")) {
                    SelectActionScreen selectActionScreen = new SelectActionScreen(this.getBankCard(), this);
                    selectActionScreen.work();
                }
                if (userInput.equals("t")) {
                    ReturnCardScreen returnCardScreen = new ReturnCardScreen(this.getBankCard(), this);
                    returnCardScreen.work();
                }
                doubleUserInput = Double.parseDouble(userInput);
                if (doubleUserInput <= getCardBalance() && doubleUserInput <= getAtm().getBalanceATM()) {
                    setCardBalance(getCardBalance() - doubleUserInput);
                    getAtm().setBalanceATM(getAtm().getBalanceATM() - doubleUserInput);
                    System.out.println("Please, take your " + doubleUserInput + " dollars.");
                } else if (doubleUserInput >= getCardBalance()) {
                    System.out.println("You aren't enough money on your card.");
                } else if (doubleUserInput >= getAtm().getBalanceATM()) {
                    System.out.println("The ATM aren't enough money.");
                }
            } else {
                showUserInterface(userInput);
            }
        }
    }

    public static boolean isNumeric(String userInput) {
        try {
            Double.parseDouble(userInput);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
}

