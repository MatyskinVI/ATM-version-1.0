package com.Matyskin.screen;

import com.Matyskin.BankCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectActionScreen extends Screen {

    public SelectActionScreen (BankCard bankCard, Screen screen) {
        super(bankCard, screen.getAtm());
    }

    @Override
    public void showUserInterface() {
        System.out.println("___________________________" +
                "\n|Welcome to your card.    |" +
                "\n|Enter \"g\" to get Balance |" +
                "\n|Enter \"c\" to get cash    |" +
                "\n|Enter \"t\" to take card   |" +
                "\n|Please make your choice :|" +
                "\n|        .  .  .  .       |" +
                "\n|_________________________|");
    }

    public void showUserInterface(String choice) {
        System.out.println("You have entered : \"" + choice + "\". " +
                "\nIt's wrong input.");
        showUserInterface();
    }

    @Override
    public void work() {
        while (true) {
            showUserInterface();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choice = null;
            try {
                choice = reader.readLine();
            } catch (IOException e) {
                System.out.println("We have caught exception in : " + e.getClass());
            }
            if (choice.equals("g") || choice.equals("c") || choice.equals("t")) {
                if (choice.equals("g")) {
                    ShowBalanceScreen showBalanceScreen = new ShowBalanceScreen(this.getBankCard(), this);
                    showBalanceScreen.work();
                }
                if (choice.equals("c")) {
                    InputMoneyScreen inputMoneyScreen = new InputMoneyScreen(this.getBankCard(), this);
                    inputMoneyScreen.work();
                }
                if (choice.equals("t")) {
                    ReturnCardScreen returnCardScreen = new ReturnCardScreen(this.getBankCard(), this);
                    returnCardScreen.work();
                }
            } else {
                showUserInterface(choice);
            }
        }
    }
}
