package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.UtilityMethods;

public class Sauce extends Topping{
    private UtilityMethods.saucesType saucesType;

    public Sauce(boolean isExtra, UtilityMethods.saucesType saucesType) {
        super(isExtra);
        this.saucesType = saucesType;
    }

    public UtilityMethods.saucesType getSaucesType() {
        return saucesType;
    }

    public void setSaucesType(UtilityMethods.saucesType saucesType) {
        this.saucesType = saucesType;
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }
}
