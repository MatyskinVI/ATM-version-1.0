package com.Matyskin.screen;

public class PinCodeInputScreen extends Screen {

    @Override
    public void showUserInterface() {
    }

    @Override
    public void showUserInterface(String pinCodeInputTry) {
        System.out.println("________________________" +
                "\n|Please enter your PIN.| " +
                "\n|You have "+ (3 - Integer.parseInt(pinCodeInputTry)) +" tries.     |" +
                "\n|      .  .  .  .      |"+
                "\n|______________________|");
    }
}
