package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Screen4 extends ScreenATM{
    @Override
    public void showMenu() throws IOException {
        while (true){
            System.out.println("_________________________________________________" +
                    "\n|insert \"r\" to return to the previous menu      |" +
                    "\n|insert \"t\" to take card                        |" +
                    "\n|Please insert sum you need to get or " +"\"r\" or \"t\"|" +
                    "\n|do your choice :                               |" +
                    "\n|                 .  .  .  .                    |" +
                    "\n|_______________________________________________|");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String result = reader.readLine();
            int ressultInt;
            if (result.equals("r") || result.equals("t")) {
                switch (result) {
                    case "r":
                        Screen2 screen2 = new Screen2();
                        screen2.showMenu();
                    case "t":
                        Screen3 screen3 = new Screen3();
                        screen3.showMenu();
                }
            }
            else{
                ressultInt = Integer.parseInt(result);
                if (ressultInt <= getCountMoneyINCart()){
                    setCountMoneyINCart(getCountMoneyINCart() - ressultInt);
                    System.out.println("Please, take your " + ressultInt + " dollars.");
                }
                else
                    System.out.println("You aren't enough money on your card.");
            }

        }
    }

    public static void main(String[] args) throws IOException {
        Screen4 screen4 = new Screen4();
        screen4.showMenu();
    }
}

