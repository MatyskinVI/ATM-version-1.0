package com;

import com.screen.PinCodeInputScreen;
import com.screen.Screen;

import java.io.IOException;

public class StartATM {
    public static void main(String[] args) throws IOException {
        Screen atm = new PinCodeInputScreen(1111,
                2222111122223333L, 1000);
        atm.showScreen();
    }

}
