package com.screen;

import com.ATM;
import com.BankCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinCodeInputScreen extends Screen {
    int pinCodeInputTry = 0;

    public PinCodeInputScreen(BankCard bankCard , ATM nameATM){
        super(bankCard, nameATM);
    }

    @Override
    public void work() {
        int inputPinCode = 0;

        System.out.println("Welcome to " + getAtm().getNameATM() + ".");
        while (pinCodeInputTry != 3){
            showUserInterface();
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
                SelectActionScreen selectActionScreen = new SelectActionScreen(this.getBankCard(), this);
                selectActionScreen.work();
            }
        }
        System.out.println("Your card is blocked. Please call your bank.");
        System.exit(0);
    }

    @Override
    public void showUserInterface() {
        System.out.println("________________________" +
                "\n|Please enter your PIN.| " +
                "\n|You have "+ (3 - pinCodeInputTry) +" tries.     |" +
                "\n|      .  .  .  .      |"+
                "\n|______________________|");
    }
}
