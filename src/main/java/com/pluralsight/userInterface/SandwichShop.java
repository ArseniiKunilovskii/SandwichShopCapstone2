package com.pluralsight.userInterface;

import com.pluralsight.utilitlyMethods.UtilityMethods;

public class SandwichShop {
    private static UtilityMethods utilityMethods;

    public static void main(String[] args) {
        boolean quit = false;
        utilityMethods = new UtilityMethods();
        while (!quit) {
            System.out.println("Hello! Would you like to make an order?(Yes/No)");
            if (utilityMethods.getYesOrNo()) {
                UserInterface ui = new UserInterface();
                ui.display();
            } else {
                quit = true;
                System.out.println("Thank you for visit! Come back!");
            }
        }

    }
}
