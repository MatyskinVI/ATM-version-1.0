package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Screen2 extends ScreenATM{

    @Override
    public void showMenu() throws IOException {
        System.out.println("__________________________________" +
                "\n|Welcome to your card.           |" +
                "\n|insert \"g\" to get Balance       |" +
                "\n|insert \"c\" to get cash          |" +
                "\n|insert \"t\" to take card         |" +
                "\n|Please, insert \"g\" or \"c\" or \"t\"| " +
                "\n|do your choice :                |" +
                "\n|            .  .  .  .          |" +
                "\n|________________________________|");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choice = reader.readLine();
        switch (choice) {
            case "g":
                Screen5 screen5 = new Screen5();
                screen5.showMenu();
            case "c":
                Screen4 screen4 = new Screen4();
                screen4.showMenu();
            case "t":
                Screen3 screen3 = new Screen3();
                screen3.showMenu();

        }
    }

    public static void main(String[] args) throws IOException {
        Screen2 screen2 = new Screen2();
        screen2.showMenu();
    }
}
