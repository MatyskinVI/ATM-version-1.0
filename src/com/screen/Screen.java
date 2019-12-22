package com.screen;

import com.ATM;
import com.BankCard;

import java.io.IOException;

public abstract class Screen {
    private BankCard bankCard;
    private ATM atm;

    public Screen(BankCard bankCard, ATM atm) {
        this.bankCard = bankCard;
        this.atm = atm;
    }

    public int getCardPinCode() {
        return bankCard.getCardPinCode();
    }

    public double getCardBalance() {
        return bankCard.getCardBalance();
    }

    public void setCardBalance(double money) {
        bankCard.setCardBalance(money);
    }

    public long getNumberCart() {
        return bankCard.getNumberCart();
    }

    public abstract void showScreen() throws IOException;

    public ATM getAtm() {
        return atm;
    }

    public BankCard getBankCard() {
        return this.bankCard;
    }
}
