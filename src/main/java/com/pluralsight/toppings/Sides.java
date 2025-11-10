package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.UtilityMethods;

public class Sides extends Topping{
    private UtilityMethods.sides sides;

    public Sides(boolean isExtra, UtilityMethods.sides sides) {
        super(isExtra);
        this.sides = sides;
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }

    public UtilityMethods.sides getSides() {
        return sides;
    }

    public void setSides(UtilityMethods.sides sides) {
        this.sides = sides;
    }
}
