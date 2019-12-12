package com.screen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputMoneyScreen extends Screen {

    public InputMoneyScreen(Screen screen) {
        super(screen.getCardPinCode(), screen.getNumberCart(), screen.getCardBalance());
    }

    @Override
    public void showScreen() throws IOException {
        int intUserInput;
        String userInput;

        while (true){
            System.out.println("_________________________________________________" +
                    "\n|insert \"r\" to return to the previous menu      |" +
                    "\n|insert \"t\" to take card                        |" +
                    "\n|Please insert sum you need to get or " +"\"r\" or \"t\"|" +
                    "\n|do your choice :                               |" +
                    "\n|                 .  .  .  .                    |" +
                    "\n|_______________________________________________|");
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
            intUserInput = Integer.parseInt(userInput);
            if (intUserInput <= getCardBalance()) {
                setCardBalance(getCardBalance() - intUserInput);
                System.out.println("Please, take your " + intUserInput + " dollars.");
            }
            if (intUserInput >= getCardBalance()) {
                System.out.println("You aren't enough money on your card.");
            }
        }
    }
}

