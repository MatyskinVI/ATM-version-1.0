package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Screen2 extends ScreenATM{

    @Override
    public void showMenu() throws IOException {
        System.out.println("Welcome to your card. \n ----------------------- \ninsert \"g\" to get Balance " +
                "\ninsert \"c\" to get cash \ninsert \"t\" to take card \n -----------------------" +
                "\nPlease, insert \"g\" or \"c\" or \"t\" \ndo your choice : \n   .  .  .  .");
        //while (true){
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
           // }
        }
    }

    public static void main(String[] args) throws IOException {
        Screen2 screen2 = new Screen2();
        screen2.showMenu();
    }
}
