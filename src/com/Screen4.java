package com;

import java.io.IOException;

public class Screen4 extends ScreenATM{
    @Override
    public void showMenu() {
        System.out.println("\n----------------------- \ninsert \"r\" to return to the previos menu " +
                "\ninsert \"e\" to take card \n -----------------------" + "\nPlease insert sum you need to get or \"r\" or \"e\" \ndo your choice :");
    }
}
