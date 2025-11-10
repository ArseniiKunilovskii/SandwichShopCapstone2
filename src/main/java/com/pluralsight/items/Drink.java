package com.pluralsight.items;

import com.pluralsight.utilitlyMethods.UtilityMethods;

public class Drink extends Item{
    private String size;
    private UtilityMethods.drinkType drinkType;

    public Drink(int amount, String size, UtilityMethods.drinkType drinkType) {
        super(amount);
        this.size = size;
        this.drinkType = drinkType;
    }

    public Drink(String size, UtilityMethods.drinkType drinkType) {
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

    public UtilityMethods.drinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(UtilityMethods.drinkType drinkType) {
        this.drinkType = drinkType;
    }
}
