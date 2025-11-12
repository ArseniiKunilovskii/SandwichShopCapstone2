package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

public class Sauce extends Topping{
    private ToppingMethods.SaucesType saucesType;

    public Sauce(boolean isExtra, ToppingMethods.SaucesType saucesType) {
        super(isExtra);
        this.saucesType = saucesType;
    }

    public ToppingMethods.SaucesType getSaucesType() {
        return saucesType;
    }

    public void setSaucesType(ToppingMethods.SaucesType saucesType) {
        this.saucesType = saucesType;
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }

    public String getName() {
        return saucesType.toString();
    }
}
