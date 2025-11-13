package com.pluralsight.utilitlyMethods;

import java.util.Scanner;

/**
 * Provides simple utility methods for handling user input from the console.
 */
public class UtilityMethods {
    private final Scanner scanner;

    /**
     * Constructs a new UtilityMethods instance and initializes the Scanner.
     */
    public UtilityMethods(){
        scanner = new Scanner(System.in);
    }

    /**
     * Prompts the user for a "Yes" or "No" input and returns the corresponding boolean value.
     * Input is case-insensitive.
     * @return {@code true} if "Yes" is entered, {@code false} if "No" is entered.
     */
    public boolean getYesOrNo(){
        while (true) {
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Yes")) {
                return true;
            } else if (choice.equalsIgnoreCase("No")) {
                return false;
            }
            else {
                System.out.println("Please enter \"Yes\" or \"No\"");
            }
        }
    }

    /**
     * Prompts the user for an integer input. Handles non-integer input gracefully
     * by prompting the user to re-enter.
     * @return The valid integer entered by the user.
     */
    public int getInt(){
        int i;
        while(!scanner.hasNextInt()) {
            System.out.println("Please enter integer.");
            scanner.nextLine();                 // discard bad input
        }
        i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }


}