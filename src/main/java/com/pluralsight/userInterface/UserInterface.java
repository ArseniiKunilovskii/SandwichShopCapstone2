package com.pluralsight.userInterface;

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
        System.out.println("What type of sandwich do you want? (Standard or Custom)");
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

    }
    public Item getDrink(){

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
