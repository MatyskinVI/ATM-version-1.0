package com.Matyskin.screen;

import com.Matyskin.ATM;
import com.Matyskin.BankCard;

public abstract class Screen {
    private BankCard bankCard;
    private ATM atm;

    public Screen(BankCard bankCard, ATM atm) {
        this.bankCard = bankCard;
        this.atm = atm;
    }

    public ATM getAtm() {
        return atm;
    }

    public BankCard getBankCard() {
        return this.bankCard;
    }

    public double getCardBalance() {
        return bankCard.getCardBalance();
    }

    public int getCardPinCode() {
        return bankCard.getCardPinCode();
    }

    public void setCardBalance(double money) {
        bankCard.setCardBalance(money);
    }

    public abstract void showUserInterface();

    public void showUserInterface(String userInput) {}

    public abstract void work();
}
