package com.pluralsight.userInterface;

import com.pluralsight.utilitlyMethods.UtilityMethods;

/**
 * The main entry point for the Sandwich Shop application.
 * It manages the main loop to start new orders.
 */
public class SandwichShop {
    private static UtilityMethods utilityMethods;

    /**
     * The main method that starts the application loop.
     * @param args Command line arguments (not used).
     */
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