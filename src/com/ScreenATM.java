package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class ScreenATM {
    private int cartPinCode;
    private long numberCart;
    private int countMoneyINCart;

    public ScreenATM(int cartPinCode, long numberCart, int countMoneyINCart){
        this.cartPinCode = cartPinCode;
        this.numberCart = numberCart;
        this.countMoneyINCart = countMoneyINCart;
    }

    public void showMenu() throws Exception{
        System.out.println("Welcome to ATM. \nPlease insert your PIN. \n   .  .  .  .");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userPIN = Integer.parseInt(reader.readLine());
        if (userPIN == cartPinCode){
            //System.out.println("Your cart number is " + cartPinCode+ "\nYour number card is " + numberCart);// Test
            System.out.println();
        }
    }
}
