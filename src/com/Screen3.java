package com;

import java.io.IOException;

public class Screen3 extends ScreenATM{
    @Override
    public void showMenu() {
        System.out.println("_________________________" +
                "\n|Thanks. Take your card.|" +
                "\n|_______________________|");
        System.exit(0);
    }

    public static void main(String[] args) {
        Screen3 screen3 = new Screen3();
        screen3.showMenu();
    }
}
