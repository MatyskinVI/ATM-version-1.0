package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ScreenATM {
    private static int cartPinCode;
    private static long numberCart;
    private static int countMoneyINCart;

    public int getCartPinCode() {
        return cartPinCode;
    }
    public int getCountMoneyINCart() {
        return countMoneyINCart;
    }
    public void setCountMoneyINCart(int countMoneyINCart) {
        this.countMoneyINCart = countMoneyINCart;
    }
    public long getNumberCart() {
        return numberCart;
    }

    public ScreenATM(int cartPinCode, long numberCart, int countMoneyINCart){
        this.cartPinCode = cartPinCode;
        this.numberCart = numberCart;
        this.countMoneyINCart = countMoneyINCart;
    }
    public ScreenATM(){}

    public abstract void showMenu() throws IOException;
}
