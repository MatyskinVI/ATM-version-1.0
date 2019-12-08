package com;

import java.io.IOException;

public class Screen5 extends ScreenATM{

    @Override
    public void showMenu() throws IOException {
        System.out.println(getCountMoneyINCart());
    }
}
