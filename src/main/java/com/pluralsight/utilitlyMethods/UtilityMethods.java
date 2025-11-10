package com.pluralsight.utilitlyMethods;

import java.util.Scanner;

public class UtilityMethods {
    private Scanner scanner;

    public UtilityMethods(){
        scanner = new Scanner(System.in);
    }

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

    public int getInt(){
        int i = 0;
        while(!scanner.hasNextInt()) {
            System.out.println("Please enter integer.");
            scanner.nextLine();                 // discard bad input
        }
        i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }


}
