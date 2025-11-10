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

    public enum breadType{
        White, Wheat, Rye, Wrap
    }
    public enum meatType{
        Steak, Ham, Salami, RoastBeef, Chicken, Bacon
    }
    public enum cheeseType{
        American, Provolone, Cheddar, Swiss
    }
    public enum regularToppingsType{
        lettuce, peppers , onions, tomatoes, jalapeños, cucumbers, pickles, guacamole, mushrooms
    }
    public enum saucesType{
        mayo, mustard, ketchup, ranch, thousand_islands, vinaigrette
    }
    public enum sides{
        au_jus, sauce
    }
    public enum drinkType{
        Coca_Cola, DrPepper, Sprite, Pepsi, Diet_Coke, Mountain_Dew, Coke_Zero, Diet_Pepsi, Fanta, Ginger_Ale
    }
    public enum chipsType{
        Lays, Doritos, Cheetos
    }
}
