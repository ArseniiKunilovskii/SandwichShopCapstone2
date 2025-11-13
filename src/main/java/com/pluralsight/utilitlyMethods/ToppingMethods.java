package com.pluralsight.utilitlyMethods;

import com.pluralsight.toppings.Topping;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Provides static utility methods for handling topping-related tasks,
 * such as getting user selection for various topping types and calculating total topping prices.
 */
public class ToppingMethods {

    private static final UtilityMethods utilityMethods = new UtilityMethods();

    /**
     * Prompts the user to select a meat type and returns the choice.
     * @return The selected {@link MeatType}.
     * @throws IllegalStateException if an unexpected choice is made (should be caught by the loop).
     */
    public static MeatType getMeatType(){
        int choice = -1;
        MeatType meatType;

        System.out.println("\nWhat type of meat do you want?");
        System.out.println("1. Steak");
        System.out.println("2. Ham");
        System.out.println("3. Salami");
        System.out.println("4. RoastBeef");
        System.out.println("5. Chicken");
        System.out.println("6. Bacon");

        while (choice<0||choice>6){
            System.out.println("Please enter number from 1 to 6");
            choice = utilityMethods.getInt();
        }
        meatType = switch (choice){
            case 1 -> MeatType.Steak;
            case 2 -> MeatType.Ham;
            case 3 -> MeatType.Salami;
            case 4 -> MeatType.RoastBeef;
            case 5 -> MeatType.Chicken;
            case 6 -> MeatType.Bacon;
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        return meatType;
    }

    /**
     * Prompts the user to select a cheese type and returns the choice.
     * @return The selected {@link CheeseType}.
     * @throws IllegalStateException if an unexpected choice is made (should be caught by the loop).
     */
    public static CheeseType getCheeseType(){
        int choice = -1;
        CheeseType cheeseType;

        System.out.println("\nWhat type of Cheese do you want?");
        System.out.println("1. American");
        System.out.println("2. Provolone");
        System.out.println("3. Cheddar");
        System.out.println("4. Swiss");

        while (choice<0||choice>4){
            System.out.println("Please enter number from 1 to 4");
            choice = utilityMethods.getInt();
        }
        cheeseType = switch (choice){
            case 1 -> CheeseType.American;
            case 2 -> CheeseType.Provolone;
            case 3 -> CheeseType.Cheddar;
            case 4 -> CheeseType.Swiss;
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        return cheeseType;
    }

    /**
     * Prompts the user to select a regular topping (vegetable/condiment) type and returns the choice.
     * @return The selected {@link RegularToppingsType}.
     * @throws IllegalStateException if an unexpected choice is made (should be caught by the loop).
     */
    public static RegularToppingsType getRegularToppingsType(){
        int choice = -1;
        RegularToppingsType regularToppingsType;

        System.out.println("\nWhat type of vegetable do you want?");
        System.out.println("1. lettuce");
        System.out.println("2. peppers");
        System.out.println("3. onions");
        System.out.println("4. tomatoes");
        System.out.println("5. jalapeños");
        System.out.println("6. cucumbers");
        System.out.println("7. pickles");
        System.out.println("8. guacamole");
        System.out.println("9. mushrooms");

        while (choice<0||choice>9){
            System.out.println("Please enter number from 1 to 9");
            choice = utilityMethods.getInt();
        }
        regularToppingsType = switch (choice){
            case 1 -> RegularToppingsType.lettuce;
            case 2 -> RegularToppingsType.peppers;
            case 3 -> RegularToppingsType.onions;
            case 4 -> RegularToppingsType.tomatoes;
            case 5 -> RegularToppingsType.jalapenos;
            case 6 -> RegularToppingsType.cucumbers;
            case 7 -> RegularToppingsType.pickles;
            case 8 -> RegularToppingsType.guacamole;
            case 9 -> RegularToppingsType.mushrooms;
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        return regularToppingsType;
    }

    /**
     * Prompts the user to select a sauce type and returns the choice.
     * @return The selected {@link SaucesType}.
     * @throws IllegalStateException if an unexpected choice is made (should be caught by the loop).
     */
    public static SaucesType getSaucesType(){
        int choice = -1;
        SaucesType saucesType;

        System.out.println("\nWhat type of sauce do you want?");
        System.out.println("1. mayo");
        System.out.println("2. mustard");
        System.out.println("3. ketchup");
        System.out.println("4. ranch");
        System.out.println("5. thousand islands");
        System.out.println("6. vinaigrette");

        while (choice<0||choice>6){
            System.out.println("Please enter number from 1 to 6");
            choice = utilityMethods.getInt();
        }
        saucesType = switch (choice){
            case 1 -> SaucesType.mayo;
            case 2 -> SaucesType.mustard;
            case 3 -> SaucesType.ketchup;
            case 4 -> SaucesType.ranch;
            case 5 -> SaucesType.thousand_islands;
            case 6 -> SaucesType.vinaigrette;
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        return saucesType;
    }

    /**
     * Prompts the user to select a side item type and returns the choice.
     * @return The selected {@link Sides}.
     * @throws IllegalStateException if an unexpected choice is made (should be caught by the loop).
     */
    public static Sides getSides(){
        int choice = -1;
        Sides sides;

        System.out.println("\nWhat type of sauce do you want?");
        System.out.println("1. au jus");
        System.out.println("2. sauce");

        while (choice<0||choice>2){
            System.out.println("Please enter number 1 or 2");
            choice = utilityMethods.getInt();
        }
        sides = switch (choice){
            case 1 -> Sides.au_jus;
            case 2 -> Sides.sauce;

            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        return sides;
    }

    /**
     * Prompts the user to confirm if they want an extra portion of a specified topping.
     * @param topping The name of the topping (e.g., "Steak").
     * @return {@code true} if the user selects yes for extra, {@code false} otherwise.
     */
    public static boolean getExtra(String topping){
        System.out.println("Do you want extra " + topping+"? (yes or no)");
        return utilityMethods.getYesOrNo();
    }

    /**
     * Calculates the total price of all toppings in a list for a given sandwich size.
     * @param toppings An {@link ArrayList} of {@link Topping} objects.
     * @param size The size of the sandwich in inches.
     * @return The aggregated price of all toppings.
     */
    public static double getTotalToppingPrice(ArrayList<Topping> toppings, int size){
        ArrayList<Double> prices = toppings.stream().map(topping -> topping.getPrice(size)).collect(Collectors.toCollection(ArrayList::new));
        return prices.stream().reduce(0.0, Double::sum);
    }

    /**
     * Enum representing the available types of bread for a sandwich.
     */
    public enum BreadType {
        White, Wheat, Rye, Wrap
    }

    /**
     * Enum representing the available types of meat toppings.
     */
    public enum MeatType {
        Steak, Ham, Salami, RoastBeef, Chicken, Bacon
    }

    /**
     * Enum representing the available types of cheese toppings.
     */
    public enum CheeseType {
        American, Provolone, Cheddar, Swiss
    }

    /**
     * Enum representing the available regular (non-meat, non-cheese) toppings.
     */
    public enum RegularToppingsType {
        lettuce, peppers , onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms
    }

    /**
     * Enum representing the available sauce types.
     */
    public enum SaucesType {
        mayo, mustard, ketchup, ranch, thousand_islands, vinaigrette
    }

    /**
     * Enum representing the available side items (conceptually treated as toppings here).
     */
    public enum Sides {
        au_jus, sauce
    }

    /**
     * Enum representing the available drink types.
     */
    public enum DrinkType {
        Coca_Cola, DrPepper, Sprite, Pepsi, Diet_Coke, Mountain_Dew, Coke_Zero, Diet_Pepsi, Fanta, Ginger_Ale
    }

    /**
     * Enum representing the available chip types.
     */
    public enum ChipsType {
        Lays, Doritos, Cheetos
    }
}