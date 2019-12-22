package com.screen;

import com.BankCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowBalanceScreen extends Screen {

    public ShowBalanceScreen(BankCard bankCard, Screen screen) {
        super(bankCard, screen.getAtm());
    }

    @Override
    public void showScreen() throws IOException {
        String userInput;

        System.out.println("Your count money is : " + getCardBalance() + "" +
                "\nATM count money is : " + getAtm().getBalanceATM());                          // Test ATM
        System.out.println("___________________________________________" +
                "\n|insert \"r\" to return to the previous menu|" +
                "\n|insert \"t\" to take card                  |" +
                "\n|Please insert \"r\" or \"t\"                 |" +
                "\n|do your choice :                         |" +
                "\n|              .  .  .  .                 |" +
                "\n|_________________________________________|");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        userInput = reader.readLine();
        if (userInput.equals("r")) {
            SelectActionScreen selectActionScreen = new SelectActionScreen(this.getBankCard(), this);
            selectActionScreen.showScreen();
        }
        if (userInput.equals("t")) {
            ReturnCardScreen returnCardScreen = new ReturnCardScreen(this.getBankCard(), this);
            returnCardScreen.showScreen();
        }
    }
}
