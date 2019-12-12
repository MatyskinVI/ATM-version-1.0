package com.screen;

public class ReturnCardScreen extends Screen {

    public ReturnCardScreen(Screen screen) {
        super(screen.getCardPinCode(), screen.getNumberCart(), screen.getCardBalance());
    }

    @Override
    public void showScreen() {
        System.out.println("_________________________" +
                "\n|Thanks. Take your card.|" +
                "\n|_______________________|");
        System.exit(0);
    }
}
