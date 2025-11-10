package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

public class Sides extends Topping{
    private ToppingMethods.Sides sides;

    public Sides(boolean isExtra, ToppingMethods.Sides sides) {
        super(isExtra);
        this.sides = sides;
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }

    public ToppingMethods.Sides getSides() {
        return sides;
    }

    public void setSides(ToppingMethods.Sides sides) {
        this.sides = sides;
    }
}
