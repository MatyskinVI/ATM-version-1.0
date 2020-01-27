package com.Matyskin;

public class ATM {
    private String nameATM;
    private double balanceATM;

    public ATM(String nameATM, int balanceATM) {
        this.nameATM = nameATM;
        this.balanceATM = balanceATM;
    }

    public ATM() {
        this.nameATM = "Belarus Bank ATM";
        this.balanceATM = 12000;
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
}
