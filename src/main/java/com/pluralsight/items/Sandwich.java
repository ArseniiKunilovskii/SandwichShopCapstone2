package com.pluralsight.items;

import com.pluralsight.utilitlyMethods.UtilityMethods;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Item {
    private int size;
    private UtilityMethods.breadType breadType;
    private ArrayList<Topping> toppings;
    private boolean isToasted;

    public Sandwich(int amount, int size, UtilityMethods.breadType breadType, ArrayList<Topping> toppings, boolean isToasted) {
        super(amount);
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }

    @Override
    public double getPrice() {
        double total = 0;
        switch (size){
            case 4:
                total+= 5.5;
                break;
            case 8:
                total+=7;

                break;
            case 12:
                total+=8.5;
                break;
        }
        List<Double> prices = toppings.stream().map(topping -> topping.getPrice(size)).toList();
        total += prices.stream().reduce(0.0, (temp, num) -> temp+num);
        return total;
    }

}
