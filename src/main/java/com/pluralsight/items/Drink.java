package com.pluralsight.items;

import com.pluralsight.utilitlyMethods.ToppingMethods;

public class Drink extends Item{
    private String size;
    private ToppingMethods.DrinkType drinkType;

    public Drink(int amount, String size, ToppingMethods.DrinkType drinkType) {
        super(amount);
        this.size = size;
        this.drinkType = drinkType;
    }

    public Drink(String size, ToppingMethods.DrinkType drinkType) {
        this.size = size;
        this.drinkType = drinkType;
    }

    @Override
    public double getPrice() {
        double price;
        if (size.equalsIgnoreCase("small")){
            price=2.00;
        }
        else if (size.equalsIgnoreCase("Medium")){
            price= 2.50;
        }else if (size.equalsIgnoreCase("Large")){
            price= 3.00;
        }else {
            System.out.println("Something went wrong, it is on us!");
            price= 0;
        }
        return price*getAmount();
    }

    @Override
    public String toString() {
        return String.format("%-2d %-8s %-15s - $%6.2f",
                getAmount(), size, drinkType, getPrice());
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ToppingMethods.DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(ToppingMethods.DrinkType drinkType) {
        this.drinkType = drinkType;
    }
}
