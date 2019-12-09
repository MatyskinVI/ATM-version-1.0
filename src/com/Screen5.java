package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Screen5 extends ScreenATM{

    @Override
    public void showMenu() throws IOException {
        System.out.println("Your count money is : " + getCountMoneyINCart());
        System.out.println("___________________________________________" +
                "\n|insert \"r\" to return to the previous menu|" +
                "\n|insert \"t\" to take card                  |" +
                "\n|Please insert \"r\" or \"t\"                 |" +
                "\n|do your choice :                         |" +
                "\n|              .  .  .  .                 |" +
                "\n|_________________________________________|");
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

    public static void main(String[] args) throws IOException {
        Screen5 screen5 = new Screen5();
        screen5.showMenu();
    }
}
