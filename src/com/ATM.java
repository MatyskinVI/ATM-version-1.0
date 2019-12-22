package com;

import com.screen.PinCodeInputScreen;
import com.screen.Screen;

import java.io.IOException;

public class ATM {
    private String nameATM;
    private float balanceATM;

    public ATM(String nameATM, int balanceATM) {
        this.nameATM = nameATM;
        this.balanceATM = balanceATM;
    }

    public static void main(String[] args) throws IOException {
        ATM belarusBankATM = new ATM("Belarus Bank ATM", 12000);
        belarusBankATM.start();
    }

    public void start() throws IOException {
        BankCard belarusBankCard = new BankCard(1111,
                2222111122223333L, 1000);
        Screen atmScreen = new PinCodeInputScreen(belarusBankCard, this);
        atmScreen.showScreen();
    }

    public String getNameATM() {
        return nameATM;
    }

    public float getBalanceATM() {
        return balanceATM;
    }

    public void setBalanceATM(float balanceATM) {
        this.balanceATM = balanceATM;
    }
}
