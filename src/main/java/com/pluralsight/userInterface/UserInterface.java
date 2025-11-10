package com.pluralsight.userInterface;

import com.pluralsight.items.Chips;
import com.pluralsight.items.Drink;
import com.pluralsight.items.Item;
import com.pluralsight.items.Sandwich;
import com.pluralsight.toppings.Topping;
import com.pluralsight.utilitlyMethods.CustomSandwichMethods;
import com.pluralsight.utilitlyMethods.ToppingMethods;
import com.pluralsight.utilitlyMethods.UtilityMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private UtilityMethods utilityMethods;
    private final CustomSandwichMethods customSandwichMethods = new CustomSandwichMethods();


    public void display(){
        String choice;
        boolean quit = false;
        utilityMethods = new UtilityMethods();
        Order order = new Order();

        while (!quit){
            System.out.println("\nWhat do you want to Order?");
            System.out.println("------------------------------");
            System.out.println("1. Sandwich");
            System.out.println("2. Drink");
            System.out.println("3. Chips");
            System.out.println("------------------------------");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    order.addItem(getSandwich());
                    break;
                case "2":
                    order.addItem(getDrink());
                    break;
                case "3":
                    order.addItem(getChips());
                    break;
                case "4":
                    checkOut(order);
                    break;
                case "0":
                    cancelOrder();
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter only numbers 0-4");
                    break;
            }
        }
    }
    public Item getSandwich() {
        int choice = -1;
        System.out.println("\nWhat type of sandwich do you want? (1 or 2)");
        System.out.println("1. Custom Sandwich");
        System.out.println("2. Standard Sandwich");
        System.out.println("0. Cancel");

        while (choice<0||choice>2){
            choice = utilityMethods.getInt();
        }

        switch (choice){
            case 1:
                return getCustomSandwich();
            case 2:
                return null;
            case 0:
                return null;
            default:
                System.out.println("Something went wrong");
        }
        return null;
    }
    public Item getChips(){
        int choice = -1;
        int amount = 0;
        ToppingMethods.ChipsType type = null;
        System.out.println("\nWhat type of chips do you want?(1,2,3 or 0");
        System.out.println("1. Lays");
        System.out.println("2. Doritos");
        System.out.println("3. Cheetos");
        System.out.println("0. Exit");

        while (choice<0||choice>3){
            choice = utilityMethods.getInt();
        }

        type = switch (choice) {
            case 1 -> ToppingMethods.ChipsType.Lays;
            case 2 -> ToppingMethods.ChipsType.Doritos;
            case 3 -> ToppingMethods.ChipsType.Cheetos;
            default -> type;
        };
        System.out.println("\nHow many chips " + type + " do you want?");
        System.out.println("Please enter any positive amount");
        while (amount<=0){
            amount = utilityMethods.getInt();
        }
        return new Chips(amount,type);

    }
    public Item getDrink(){
        int choice = -1;
        int amount = 0;
        String size = "";
        ToppingMethods.DrinkType type = null;

        System.out.println("\nWhat type of drink do you want?(1-10 or 0");
        System.out.println("1. Coca-Cola");
        System.out.println("2. DrPepper");
        System.out.println("3. Sprite");
        System.out.println("4. Pepsi");
        System.out.println("5. Diet-Coke");
        System.out.println("6. Mountain Dew");
        System.out.println("7. Coke-Zero");
        System.out.println("8. Diet Pepsi");
        System.out.println("9. Fanta");
        System.out.println("10. Ginger_Ale");
        System.out.println("0. Exit");

        while (choice>10 || choice<0){
            choice = utilityMethods.getInt();
        }

        type = switch (choice) {
            case 1 -> ToppingMethods.DrinkType.Coca_Cola;
            case 2 -> ToppingMethods.DrinkType.DrPepper;
            case 3 -> ToppingMethods.DrinkType.Sprite;
            case 4 -> ToppingMethods.DrinkType.Pepsi;
            case 5 -> ToppingMethods.DrinkType.Diet_Coke;
            case 6 -> ToppingMethods.DrinkType.Mountain_Dew;
            case 7 -> ToppingMethods.DrinkType.Coke_Zero;
            case 8 -> ToppingMethods.DrinkType.Diet_Pepsi;
            case 9 -> ToppingMethods.DrinkType.Fanta;
            case 10 -> ToppingMethods.DrinkType.Ginger_Ale;
            default -> type;
        };

        choice = -1;

        System.out.println("\nWhat size of your " + type + " do you want?");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        System.out.println("0. Exit");

        while (choice<0||choice>3){
            choice = utilityMethods.getInt();
        }
        size = switch (choice){
            case 1 -> "small";
            case 2 -> "medium";
            case 3 -> "large";
            default -> "";
        };
        if (choice==0){
            return null;
        }

        System.out.println("\nHow many " +size + " "+ type + " do you want?");
        System.out.println("Please enter any positive amount");
        while (amount<=0){
            amount = utilityMethods.getInt();
        }
        System.out.println("Your "+ amount + " " +size + " "+ type +" has been added to the order.");
        return new Drink(amount,size,type);
    }

//    public Item getStandardSandwich(){
//
//    }

    public Item getCustomSandwich(){
        int amount = 0;
        int size = 0;
        boolean choice;
        ToppingMethods.BreadType breadType;
        ArrayList<Topping> toppings;
        boolean isToasted = false;

        size = CustomSandwichMethods.getSize();
        if(size == 0){
            return null;
        }
        breadType = CustomSandwichMethods.getBreadType();
        if (breadType == null){
            return null;
        }
        toppings = CustomSandwichMethods.getToppings();
        isToasted = CustomSandwichMethods.getToastedChoice();
        System.out.println("Your sandwich will cost: $" + (ToppingMethods.getTotalToppingPrice(toppings,size)+CustomSandwichMethods.getPriceBasedOnSize(size)));
        System.out.println("Do you want to add it to your order?(yes or no)");
        choice = utilityMethods.getYesOrNo();
        if (choice) {
            return new Sandwich(amount, size, breadType, toppings, isToasted);
        }else {
            return null;
        }
    }



    public void cancelOrder(){

    }
    public void checkOut(Order order){

    }

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

}
