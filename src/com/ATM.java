package com;

import com.screen.PinCodeInputScreen;
import com.screen.Screen;

public class ATM {
    private String nameATM;
    private double balanceATM;

    public ATM(String nameATM, int balanceATM) {
        this.nameATM = nameATM;
        this.balanceATM = balanceATM;
    }

    public static void main(String[] args) {
        ATM belarusBankATM = new ATM("Belarus Bank ATM", 12000);
        belarusBankATM.start();
    }

    public String getNameATM() {
        return nameATM;
    }

    public double getBalanceATM() {
        return balanceATM;
    }

    public void setBalanceATM(double balanceATM) {
        this.balanceATM = balanceATM;
    }

    public void start() {
        BankCard belarusBankCard = new BankCard();
        Screen atmScreen = new PinCodeInputScreen(belarusBankCard, this);
        atmScreen.work();
    }
}
