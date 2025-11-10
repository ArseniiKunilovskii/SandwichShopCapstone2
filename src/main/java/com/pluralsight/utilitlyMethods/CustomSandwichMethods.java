package com.pluralsight.utilitlyMethods;

import com.pluralsight.toppings.Topping;

import java.util.ArrayList;

public class CustomSandwichMethods {

    static UtilityMethods utilityMethods;

    public static int getSize(){
        int choice = 0;
        int size = 0;
        System.out.println("What size of your sandwich do you want?");
        System.out.println("1. 4\"");
        System.out.println("2. 8\"");
        System.out.println("3. 12\"");
        System.out.println("0. Exit");

        while (choice<0||choice>3){
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

    public static ToppingMethods.BreadType getBreadType(){
        int choice =-1;
        ToppingMethods.BreadType breadType;

        System.out.println("What type of bread do you want");
        System.out.println("1. White");
        System.out.println("2. Wheat");
        System.out.println("3. Rye");
        System.out.println("4. Wrap");
        System.out.println("0. Exit");

        while (choice<0||choice>4){
            choice = utilityMethods.getInt();
        }
        breadType = switch (choice){
            case 1 -> ToppingMethods.BreadType.White;
            case 2 -> ToppingMethods.BreadType.Wheat;
            case 3 -> ToppingMethods.BreadType.Rye;
            case 4 -> ToppingMethods.BreadType.Wrap;
            default -> null;
        };

        return breadType;
    }
    public static ArrayList<Topping> getToppings(){


    }
}
