package com.Matyskin.screen;

public class InputMoneyScreen extends Screen {
    @Override
    public void showUserInterface(String userInput) {
        System.out.println("You have entered : \"" + userInput + "\". " +
                "\nIt's wrong input.");
    }

    @Override
    public void showUserInterface() {
        System.out.println("__________________________________________" +
                "\n|Enter SUM to get cash                   |" +
                "\n|Enter \"r\" to return to the previous menu|" +
                "\n|Enter \"t\" to take card                  |" +
                "\n|Please make your choice :               |" +
                "\n|                 .  .  .  .             |" +
                "\n|________________________________________|");
    }
}

