package com.pluralsight.utilitlyMethods;

import static com.pluralsight.utilitlyMethods.CustomSandwichMethods.utilityMethods;

public class ToppingMethods {

    public MeatType getMeatType(){
        int choice = 0;
        MeatType meatType;

        System.out.println("What type of meat do you want?");
        System.out.println("1. Steak");
        System.out.println("2. Ham");
        System.out.println("3. Salami");
        System.out.println("4. RoastBeef");
        System.out.println("5. Chicken");
        System.out.println("6. Bacon");

        while (choice<0||choice>6){
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
    public CheeseType getCheeseType(){
        int choice = 0;
        CheeseType cheeseType;

        System.out.println("What type of Cheese do you want?");
        System.out.println("1. American");
        System.out.println("2. Provolone");
        System.out.println("3. Cheddar");
        System.out.println("4. Swiss");

        while (choice<0||choice>4){
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
    public RegularToppingsType getRegularToppingsType(){
        int choice = 0;
        RegularToppingsType regularToppingsType;

        System.out.println("What type of Cheese do you want?");
        System.out.println("1. lettuce");
        System.out.println("2. peppers");
        System.out.println("3. onions");
        System.out.println("4. tomatoes");
        System.out.println("5. jalapeños");
        System.out.println("6. cucumbers");
        System.out.println("7. pickles");
        System.out.println("8. guacamole");
        System.out.println("9. mushrooms");

        while (choice<0||choice>4){
            choice = utilityMethods.getInt();
        }
        regularToppingsType = switch (choice){
            case 1 -> RegularToppingsType.lettuce;
            case 2 -> RegularToppingsType.peppers;
            case 3 -> RegularToppingsType.onions;
            case 4 -> RegularToppingsType.tomatoes;
            case 5 -> RegularToppingsType.jalapeños;
            case 6 -> RegularToppingsType.cucumbers;
            case 7 -> RegularToppingsType.pickles;
            case 8 -> RegularToppingsType.guacamole;
            case 9 -> RegularToppingsType.mushrooms;
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        return regularToppingsType;
    }


    public enum BreadType {
        White, Wheat, Rye, Wrap
    }
    public enum MeatType {
        Steak, Ham, Salami, RoastBeef, Chicken, Bacon
    }
    public enum CheeseType {
        American, Provolone, Cheddar, Swiss
    }
    public enum RegularToppingsType {
        lettuce, peppers , onions, tomatoes, jalapeños, cucumbers, pickles, guacamole, mushrooms
    }
    public enum SaucesType {
        mayo, mustard, ketchup, ranch, thousand_islands, vinaigrette
    }
    public enum Sides {
        au_jus, sauce
    }
    public enum DrinkType {
        Coca_Cola, DrPepper, Sprite, Pepsi, Diet_Coke, Mountain_Dew, Coke_Zero, Diet_Pepsi, Fanta, Ginger_Ale
    }
    public enum ChipsType {
        Lays, Doritos, Cheetos
    }
}
