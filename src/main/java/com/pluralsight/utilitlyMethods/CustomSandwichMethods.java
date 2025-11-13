package com.pluralsight.utilitlyMethods;

import com.pluralsight.toppings.*;

import java.util.ArrayList;

/**
 * Provides static utility methods for handling the creation process of a custom Sandwich,
 * including collecting size, bread type, toppings, and calculating the base price.
 */
public class CustomSandwichMethods {

    private static final UtilityMethods utilityMethods = new UtilityMethods();

    /**
     * Prompts the user to select the size of the sandwich and returns the size in inches.
     * @return The size of the sandwich (4, 8, or 12). Returns 0 if the user exits.
     */
    public static int getSize(){
        int choice = -1;
        int size;
        System.out.println("\nWhat size of your sandwich do you want?");
        System.out.println("1. 4\" - $5.50");
        System.out.println("2. 8\" - $7.00");
        System.out.println("3. 12\" - $8.50");
        System.out.println("0. Exit");

        while (choice<0||choice>3){
            System.out.println("Please enter numbers from 0 to 3");
            choice = utilityMethods.getInt();
        }
        size = switch (choice){
            case 1 -> 4;
            case 2 -> 8;
            case 3 -> 12;
            default -> 0;
        };

        return size;
    }

    /**
     * Determines the base price of the sandwich based solely on its size.
     * @param size The size of the sandwich in inches (4, 8, or 12).
     * @return The base price of the sandwich. Returns 0 for invalid size.
     */
    public static double getPriceBasedOnSize(int size){
        return switch (size) {
            case 4 -> 5.5;
            case 8 -> 7.0;
            case 12 -> 8.5;
            default -> 0;
        };
    }

    /**
     * Prompts the user to select the type of bread for the sandwich.
     * @return The selected {@link ToppingMethods.BreadType}.
     */
    public static ToppingMethods.BreadType getBreadType(){
        int choice =-1;
        ToppingMethods.BreadType breadType;

        System.out.println("\nWhat type of bread do you want");
        System.out.println("1. White");
        System.out.println("2. Wheat");
        System.out.println("3. Rye");
        System.out.println("4. Wrap");

        while (choice<1||choice>4){
            System.out.println("Please enter numbers from 0 to 4");
            choice = utilityMethods.getInt();
        }
        breadType = switch (choice){
            case 2 -> ToppingMethods.BreadType.Wheat;
            case 3 -> ToppingMethods.BreadType.Rye;
            case 4 -> ToppingMethods.BreadType.Wrap;
            default -> ToppingMethods.BreadType.White;
        };

        return breadType;
    }

    /**
     * Guides the user through selecting all types of toppings (meat, cheese, regular, sauce, sides)
     * and whether they want them extra.
     * @return An {@link ArrayList} of selected {@link Topping} objects.
     */
    public static ArrayList<Topping> getToppings(){
        boolean choice;
        ArrayList<Topping> toppings = new ArrayList<>();
        boolean isExtra;

        System.out.println("Do you want to add meat?(yes or no)");
        choice = utilityMethods.getYesOrNo();
        if(choice) {
            ToppingMethods.MeatType meatType = ToppingMethods.getMeatType();
            isExtra = ToppingMethods.getExtra(String.valueOf(meatType));
            toppings.add(new Meat(isExtra, meatType));
        }

        System.out.println("Do you want to add cheese?(yes or no)");
        choice = utilityMethods.getYesOrNo();
        if(choice) {
            ToppingMethods.CheeseType cheeseType = ToppingMethods.getCheeseType();
            isExtra = ToppingMethods.getExtra(String.valueOf(cheeseType));
            toppings.add(new Cheese(isExtra, cheeseType));
        }

        while (choice) {
            System.out.println("Do you want to add vegetable?(yes or no)");
            choice = utilityMethods.getYesOrNo();
            if (choice) {
                ToppingMethods.RegularToppingsType regularToppingsType = ToppingMethods.getRegularToppingsType();
                isExtra = ToppingMethods.getExtra(String.valueOf(regularToppingsType));
                toppings.add(new RegularTopping(isExtra, regularToppingsType));
            }
        }

        System.out.println("Do you want to add sauce?(yes or no)");
        choice = utilityMethods.getYesOrNo();
        if(choice) {
            ToppingMethods.SaucesType sauces = ToppingMethods.getSaucesType();
            isExtra = ToppingMethods.getExtra(String.valueOf(sauces));
            toppings.add(new Sauce(isExtra, sauces));
        }

        System.out.println("Do you want to add sides?(yes or no)");
        choice = utilityMethods.getYesOrNo();
        if(choice) {
            ToppingMethods.Sides sides = ToppingMethods.getSides();
            isExtra = ToppingMethods.getExtra(String.valueOf(sides));
            toppings.add(new Sides(isExtra, sides));
        }
        return toppings;
    }

    /**
     * Prompts the user to select whether the sandwich should be toasted.
     * @return {@code true} if the sandwich should be toasted, {@code false} otherwise.
     */
    public static boolean getToastedChoice(){
        System.out.println("\nDo you want your sandwich to be toasted?(yes or no)");
        return utilityMethods.getYesOrNo();
    }
}