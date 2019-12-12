package com.screen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowBalanceScreen extends Screen {

    public ShowBalanceScreen(Screen screen) {
        super(screen.getCardPinCode(), screen.getNumberCart(), screen.getCardBalance());
    }

    @Override
    public void showScreen() throws IOException {
        String userInput;

        System.out.println("Your count money is : " + getCardBalance());
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
            SelectActionScreen selectActionScreen = new SelectActionScreen(this);
            selectActionScreen.showScreen();
        }
        if (userInput.equals("t")) {
            ReturnCardScreen returnCardScreen = new ReturnCardScreen(this);
            returnCardScreen.showScreen();
        }
    }
}
