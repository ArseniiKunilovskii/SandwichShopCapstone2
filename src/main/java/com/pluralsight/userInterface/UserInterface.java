package com.pluralsight.userInterface;

import com.pluralsight.items.Chips;
import com.pluralsight.items.Drink;
import com.pluralsight.items.Item;
import com.pluralsight.items.Sandwich;
import com.pluralsight.toppings.*;
import com.pluralsight.utilitlyMethods.CustomSandwichMethods;
import com.pluralsight.utilitlyMethods.ToppingMethods;
import com.pluralsight.utilitlyMethods.UtilityMethods;

import java.util.ArrayList;

public class UserInterface {
    private UtilityMethods utilityMethods;
    private final CustomSandwichMethods customSandwichMethods = new CustomSandwichMethods();


    public void display(){
        int choice;
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
            System.out.println("4. View cart");
            System.out.println("5. Checkout");
            System.out.println("0. Cancel Order");
            choice = utilityMethods.getInt();
            switch (choice){
                case 1:
                    order.addItem(getSandwich());
                    break;
                case 2:
                    order.addItem(getDrink());
                    break;
                case 3:
                    order.addItem(getChips());
                    break;
                case 4:
                    order.printOrder();
                    break;
                case 5:
                    checkOut(order);
                    break;
                case 0:
                    cancelOrder();
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter only number 0-5");
                    break;
            }
        }
    }
    public Item getSandwich() {
        int choice = -1;
        System.out.println("\nWhat type of sandwich do you want?");
        System.out.println("1. Custom Sandwich");
        System.out.println("2. Standard Sandwich");
        System.out.println("0. Cancel");

        while (choice<0||choice>2){
            System.out.println("Please enter number from 0 to 2");
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
        ToppingMethods.ChipsType type = null;
        System.out.println("\nWhat type of chips do you want?");
        System.out.println("1. Lays");
        System.out.println("2. Doritos");
        System.out.println("3. Cheetos");
        System.out.println("0. Exit");

        while (choice<0||choice>3){
            System.out.println("Please enter number from 0 to 3");
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
        String size;
        ToppingMethods.DrinkType type = null;

        System.out.println("\nWhat type of drink do you want?");
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
            System.out.println("Please enter number from 0 to 10");
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
            System.out.println("Please enter number from 0 to 3");
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

    public Item getStandardSandwich(){
        int choice = -1;
        int amount = 0;
        Sandwich sandwich;
        ArrayList<Topping> toppings;

        System.out.println("Please take a look at our Signature Sandwiches: ");
        System.out.println("1. BLT\t- \t$10.50\n\t-8\" white bread\n\t-Bacon\n\t-Cheddar\n\t-Lettuce\n\t-Tomato\n\t-Ranch\n\t-Toasted");
        System.out.println("2. Philly Cheese Steak\t- \t$10.50\n\t-8\" white bread\n\t-Steak\n\t-American Cheese\n\t-Peppers\n\t-Mayo\n\t-Toasted");
        System.out.println("0. Exit");

        while (choice<0||choice>3){
            System.out.println("Please enter number from 0 to 3");
            choice = utilityMethods.getInt();
        }
        if (choice == 0){
            return null;
        }

        System.out.println("How many those sandwiches do you want?");
        while (amount<=0){
            amount = utilityMethods.getInt();
        }
        switch (choice){
            case 1:
                toppings = new ArrayList<>();
                toppings.add(new Meat(false, ToppingMethods.MeatType.Bacon));
                toppings.add(new Cheese(false,ToppingMethods.CheeseType.Cheddar));
                toppings.add(new RegularTopping(false, ToppingMethods.RegularToppingsType.lettuce));
                toppings.add(new RegularTopping(false, ToppingMethods.RegularToppingsType.tomatoes));
                toppings.add(new Sauce(false, ToppingMethods.SaucesType.ranch));
                sandwich = new  Sandwich(amount,
                        8,
                        ToppingMethods.BreadType.White,
                        toppings,true);
                break;
            case 2:
                toppings = new ArrayList<>();
                toppings.add(new Meat(false,ToppingMethods.MeatType.Steak));
                toppings.add(new Cheese(false, ToppingMethods.CheeseType.American));
                toppings.add(new RegularTopping(false, ToppingMethods.RegularToppingsType.peppers));
                toppings.add(new Sauce(false, ToppingMethods.SaucesType.mayo));
                sandwich = new Sandwich(amount, 8, ToppingMethods.BreadType.White, toppings, true);
                break;
            default:
                sandwich = null;
                break;
        }
        return sandwich;
    }

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
        System.out.println("How many those sandwiches do you want?");
        amount = utilityMethods.getInt();
        if (choice) {
            return new Sandwich(amount, size, breadType, toppings, isToasted);
        }else {
            return null;
        }
    }

    public void cancelOrder(){

    }
    public void checkOut(Order order){
        boolean proceed;
        ReceiptFileManager recipFileManager = new ReceiptFileManager();

        if (order.isEmpty()){
            System.out.println("Your cart is empty!");
        }
        else{
            System.out.println("Please check if order is correct:");
            order.printOrder();
            System.out.println("Do you want to continue?(yes/no)");
            proceed = utilityMethods.getYesOrNo();
            if(proceed){
                double total = order.getTotal();
                double tax = total * 0.05;
                tax = (double) Math.round(tax * 100) /100;
                String paymentType = "";
                int choice = -1;
                System.out.println("Your tax: $" + tax);
                System.out.println("Final total: $" +(tax+total));
                System.out.println("Choose your payment option:");
                System.out.println("1. Card");
                System.out.println("2. Cash");
                System.out.println("3. Coupons");
                while (choice<0||choice>3) {
                    choice = utilityMethods.getInt();
                }
                switch (choice){
                    case 1 -> paymentType = "Card";
                    case 2 -> paymentType = "Cash";
                    case 3 -> paymentType = "Coupons";
                }
                System.out.println("Payment is proceeding...");
                System.out.println("Payment successful!");
                recipFileManager.saveReceipt(order, paymentType, tax);
            }else {
                System.out.println("Returning to main screen...");
            }
        }
    }

}
