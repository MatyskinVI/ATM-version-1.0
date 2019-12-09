package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Screen5 extends ScreenATM{

    @Override
    public void showMenu() throws IOException {
        System.out.println("Your count money is : " + getCountMoneyINCart());
        System.out.println("\n----------------------- \ninsert \"r\" to return to the previous menu " +
                "\ninsert \"t\" to take card \n -----------------------" + "\nPlease insert \"r\" or \"t\" \ndo your choice :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch (reader.readLine()) {
            case "r":
                Screen2 screen2 = new Screen2();
                screen2.showMenu();
            case "t":
                Screen3 screen3 = new Screen3();
                screen3.showMenu();
        }
    }
}
