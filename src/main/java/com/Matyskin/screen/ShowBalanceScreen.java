package com.Matyskin.screen;

public class ShowBalanceScreen extends Screen {

    private String showInterface = "__________________________________________" +
            "\n|Enter \"r\" to return to the previous menu|" +
            "\n|Enter \"t\" to take your card             |" +
            "\n|Please make your choice :               |" +
            "\n|              .  .  .  .                |" +
            "\n|________________________________________|";

    @Override
    public void showUserInterface() {
        System.out.println("" + "\n" + showInterface);
    }

    @Override
    public void showUserInterface(String userInput) {
        System.out.println("You have entered : \"" + userInput + "\". " +
                "\nIt's wrong input.");
        System.out.println("" + showInterface);
    }
}
