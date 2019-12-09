package com;

import java.io.IOException;

public class Screen3 extends ScreenATM{
    @Override
    public void showMenu() {
        System.out.println("Thanks. Take your card.");
        System.exit(0);
    }
}
