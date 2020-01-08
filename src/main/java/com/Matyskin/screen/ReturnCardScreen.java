package com.Matyskin.screen;

import com.Matyskin.BankCard;

public class ReturnCardScreen extends Screen {

    public ReturnCardScreen(BankCard bankCard, Screen screen) {
        super(bankCard, screen.getAtm());
    }

    @Override
    public void showUserInterface() {
        System.out.println("_________________________" +
                "\n|Thanks. Take your card.|" +
                "\n|_______________________|");
    }

    @Override
    public void work() {
        showUserInterface();
        System.exit(0);
    }
}
