package com.screen;

import java.io.IOException;

public abstract class Screen {
    private int cardPinCode;
    private long numberCart;
    private double cardBalance;

    public Screen(int cardPinCode, long cardNumber, double cardBalance) {
        this.cardPinCode = cardPinCode;
        this.numberCart = cardNumber;
        this.cardBalance = cardBalance;
    }

    public int getCardPinCode() {
        return cardPinCode;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double money) {
        this.cardBalance = money;
    }

    public long getNumberCart() {
        return numberCart;
    }

    public abstract void showScreen() throws IOException;
}
