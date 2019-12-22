package com.screen;

import com.BankCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectActionScreen extends Screen {

    public SelectActionScreen (BankCard bankCard, Screen screen) {
        super(bankCard, screen.getAtm());
    }

    @Override
    public void showScreen() throws IOException {
        System.out.println("__________________________________" +
                "\n|Welcome to your card.           |" +
                "\n|insert \"g\" to get Balance       |" +
                "\n|insert \"c\" to get cash          |" +
                "\n|insert \"t\" to take card         |" +
                "\n|Please, insert \"g\" or \"c\" or \"t\"| " +
                "\n|do your choice :                |" +
                "\n|            .  .  .  .          |" +
                "\n|________________________________|");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choice = reader.readLine();
        if (choice.equals("g")) {
            ShowBalanceScreen showBalanceScreen = new ShowBalanceScreen(this.getBankCard(), this);
            showBalanceScreen.showScreen();
        }
        if (choice.equals("c")) {
            InputMoneyScreen inputMoneyScreen = new InputMoneyScreen(this.getBankCard(), this);
            inputMoneyScreen.showScreen();
        }
        if (choice.equals("t")) {
            ReturnCardScreen returnCardScreen = new ReturnCardScreen(this.getBankCard(), this);
            returnCardScreen.showScreen();
        }
    }
}
