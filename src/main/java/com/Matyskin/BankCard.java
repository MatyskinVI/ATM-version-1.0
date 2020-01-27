package com.Matyskin;

public class BankCard {
    private long numberCard;

    public BankCard(long cardNumber) {
        this.numberCard = cardNumber;
    }

    public BankCard() {
        this.numberCard = 1111222211112222L;
    }

    public long getNumberCard() {
        return numberCard;
    }
}
