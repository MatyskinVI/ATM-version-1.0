package com.screen;

import com.BankCard;

public class ReturnCardScreen extends Screen {

    public ReturnCardScreen(BankCard bankCard, Screen screen) {
        super(bankCard, screen.getAtm());
    }

    @Override
    public void showScreen() {
        System.out.println("_________________________" +
                "\n|Thanks. Take your card.|" +
                "\n|_______________________|");
        System.exit(0);
    }
}
