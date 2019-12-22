package com.screen;

import com.ATM;
import com.BankCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinCodeInputScreen extends Screen {

    public PinCodeInputScreen(BankCard bankCard , ATM nameATM){
        super(bankCard, nameATM);
    }

    @Override
    public void showScreen() throws IOException {
        int pinCodeInputTry = 0;
        int inputPinCode;

        System.out.println("Welcome to " + getAtm().getNameATM() + ".");
        while (pinCodeInputTry != 3){
            System.out.println("_________________________" +
                    "\n|Please insert your PIN.| " +
                    "\n|You have "+ (3 - pinCodeInputTry) +" tries.      |" +
                    "\n|      .  .  .  .       |"+
                    "\n|_______________________|");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            inputPinCode = Integer.parseInt(reader.readLine());
            if (inputPinCode != getCardPinCode()) {
                pinCodeInputTry++;
                System.out.println("Your pin code is wrong.");
            }
            if (inputPinCode == getCardPinCode()) {
                SelectActionScreen selectActionScreen = new SelectActionScreen(this.getBankCard(), this);
                selectActionScreen.showScreen();
            }
        }
        System.out.println("Your card is blocked. Please call your bank.");
        System.exit(0);
    }
}
