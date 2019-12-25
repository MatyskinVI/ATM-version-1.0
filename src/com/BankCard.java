package com;

public class BankCard {
    private int cardPinCode;
    private long numberCart;
    private double cardBalance;

    public BankCard(int cardPinCode, long cardNumber, double cardBalance) {
        this.cardPinCode = cardPinCode;
        this.numberCart = cardNumber;
        this.cardBalance = cardBalance;
    }

    public BankCard() {
        this.cardPinCode = 1111;
        this.numberCart = 1111222211112222L;
        this.cardBalance = 1000;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public int getCardPinCode() {
        return cardPinCode;
    }

    public long getNumberCart() {
        return numberCart;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }
}
