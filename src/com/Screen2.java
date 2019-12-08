package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Screen2 extends ScreenATM{

    @Override
    public void showMenu() throws IOException {
        System.out.println("Welcome to your card. \n ----------------------- \ninsert 1 to get Balance " +
                "\ninsert 2 to get cash \ninsert 3 to take card \n -----------------------" +
                "\nPlease, do your choice :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(reader.readLine());
        if (choice == 1) {
            System.out.println("Your cart number is " + getNumberCart() + "\nYour money is " + getCountMoneyINCart());
        }
    }

    public static void main(String[] args) throws IOException {
        Screen2 screen2 = new Screen2();
        screen2.showMenu();
    }
}
