package com.pluralsight.userInterface;

import com.pluralsight.items.Chips;
import com.pluralsight.items.Drink;
import com.pluralsight.items.Item;
import com.pluralsight.utilitlyMethods.UtilityMethods;
import java.util.Scanner;

public class UserInterface {
    private Order order;
    private Scanner scanner;
    private UtilityMethods utilityMethods;

    public void display(){
        String choice;
        boolean quit = false;

        System.out.println("Hello! Would you like to make an order?(Yes/No)");
        if (!utilityMethods.getYesOrNo()){
            quit = true;
        }else {
            order = new Order();
        }

        while (!quit){
            System.out.println("What do you want to Order?");
            System.out.println("------------------------------");
            System.out.println("1. Custom Sandwich");
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

        System.out.println("Thank you for visit! Come back!");
    }
    public Item getSandwich() {
        int choice = -1;
        System.out.println("What type of sandwich do you want? (1 or 2)");
        System.out.println("1. Custom Sandwich");
        System.out.println("2. Standard Sandwich");
        System.out.println("0. Cancel");

        while (choice != 1 || choice != 2 || choice != 0){
            choice = utilityMethods.getInt();
        }

        switch (choice){
            case 1:
                return getCustomSandwich();
            case 2:
                return getStandardSandwich();
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
        UtilityMethods.chipsType type = null;
        System.out.println("What type of chips do you want?(1,2,3 or 0");
        System.out.println("1. Lays");
        System.out.println("2. Doritos");
        System.out.println("3. Cheetos");
        System.out.println("0. Exit");

        while (choice != 3 || choice != 1 || choice != 2 || choice != 0){
            choice = utilityMethods.getInt();
        }

        type = switch (choice) {
            case 1 -> UtilityMethods.chipsType.Lays;
            case 2 -> UtilityMethods.chipsType.Doritos;
            case 3 -> UtilityMethods.chipsType.Cheetos;
            default -> type;
        };
        System.out.println("How many chips " + type + " do you want?");
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
        UtilityMethods.drinkType type = null;
        System.out.println("What type of drink do you want?(1-10 or 0");
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
            case 1 -> UtilityMethods.drinkType.Coca_Cola;
            case 2 -> UtilityMethods.drinkType.DrPepper;
            case 3 -> UtilityMethods.drinkType.Sprite;
            case 4 -> UtilityMethods.drinkType.Pepsi;
            case 5 -> UtilityMethods.drinkType.Diet_Coke;
            case 6 -> UtilityMethods.drinkType.Mountain_Dew;
            case 7 -> UtilityMethods.drinkType.Coke_Zero;
            case 8 -> UtilityMethods.drinkType.Diet_Pepsi;
            case 9 -> UtilityMethods.drinkType.Fanta;
            case 10 -> UtilityMethods.drinkType.Ginger_Ale;
            default -> type;
        };

        choice = -1;

        System.out.println("What size of your " + type + " do you want?");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        while (choice<=0||choice>3){
            choice = utilityMethods.getInt();
        }
        size = switch (choice){
            case 1 -> "Small";
            case 2 -> "Medium";
            case 3 -> "Large";
            default -> "";
        };
        System.out.println("How many " + type + " do you want?");
        System.out.println("Please enter any positive amount");
        while (amount<=0){
            amount = utilityMethods.getInt();
        }
        return new Drink(amount,size,type);
    }

    public Item getStandardSandwich(){

    }

    public Item getCustomSandwich(){

    }
    public void cancelOrder(){

    }
    public void checkOut(Order order){

    }

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

}
