package com.Matyskin.screen;

public class SelectActionScreen extends Screen {
    @Override
    public void showUserInterface() {
        System.out.println("___________________________" +
                "\n|Welcome to your card.    |" +
                "\n|Enter \"g\" to get Balance |" +
                "\n|Enter \"c\" to get cash    |" +
                "\n|Enter \"t\" to take card   |" +
                "\n|Please make your choice :|" +
                "\n|        .  .  .  .       |" +
                "\n|_________________________|");
    }

    public void showUserInterface(String choice) {
        System.out.println("You have entered : \"" + choice + "\". " +
                "\nIt's wrong input.");
        showUserInterface();
    }
}
