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
        if (size.equalsIgnoreCase("small")){
            return 2.00;
        }
        else if (size.equalsIgnoreCase("Medium")){
            return 2.50;
        }else if (size.equalsIgnoreCase("Large")){
            return 3.00;
        }else {
            System.out.println("Something went wrong, it is on us!");
            return 0;
        }
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
