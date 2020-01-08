package com.Matyskin.screen;

import com.Matyskin.BankCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowBalanceScreen extends Screen {
    private String showBalance = "Your money count is : " + getCardBalance() + "" /*+
            "\nATM's money count is : " + getBalanceATM()*/;        // Test ATM balance
    private String showInterface = "__________________________________________" +
            "\n|Enter \"r\" to return to the previous menu|" +
            "\n|Enter \"t\" to take your card             |" +
            "\n|Please make your choice :               |" +
            "\n|              .  .  .  .                |" +
            "\n|________________________________________|";

    public ShowBalanceScreen(BankCard bankCard, Screen screen) {
        super(bankCard, screen.getAtm());
    }

    @Override
    public void showUserInterface() {
        System.out.println("" + showBalance + "\n" + showInterface);
    }

    @Override
    public void showUserInterface(String userInput) {
        System.out.println("You have entered : \"" + userInput + "\". " +
                "\nIt's wrong input.");
        System.out.println("" + showInterface);
    }

    @Override
    public void work() {
        String userInput = "";
        showUserInterface();

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
                    SelectActionScreen selectActionScreen = new SelectActionScreen(this.getBankCard(), this);
                    selectActionScreen.work();
                }
                if (userInput.equals("t")) {
                    ReturnCardScreen returnCardScreen = new ReturnCardScreen(this.getBankCard(), this);
                    returnCardScreen.work();
                }
            } else {
                showUserInterface(userInput);
            }
        }
    }
}
