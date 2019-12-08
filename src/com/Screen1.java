package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Screen1 extends ScreenATM{

    public Screen1(int pinCode, long cardNumber, int countMoney){
        super(pinCode, cardNumber, countMoney);
    }

    @Override
    public void showMenu() throws IOException {
        int count = 0;
        System.out.println("Welcome to ATM.");
        while (count != 3){
            System.out.println("Please insert your PIN. \n   .  .  .  .");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int userPIN = Integer.parseInt(reader.readLine());
            if (userPIN == getCartPinCode() && count != 3) {
                //System.out.println("Your cart number is " + getNumberCart() + "\nYour money is " + getCountMoneyINCart()); //Test
                Screen2 screen2 = new Screen2();
                screen2.showMenu();
            }
            else{
                count++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Screen1 screen1 = new Screen1(1111, 2222333322223333l, 1000);
        screen1.showMenu();
    }
}
