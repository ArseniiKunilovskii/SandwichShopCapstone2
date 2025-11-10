package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.UtilityMethods;

public class RegularTopping extends Topping {
    private UtilityMethods.regularToppingsType regularToppingsType;

    public RegularTopping(boolean isExtra, UtilityMethods.regularToppingsType regularToppingsType) {
        super(isExtra);
        this.regularToppingsType = regularToppingsType;
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }

    public UtilityMethods.regularToppingsType getRegularToppingsType() {
        return regularToppingsType;
    }

    public void setRegularToppingsType(UtilityMethods.regularToppingsType regularToppingsType) {
        this.regularToppingsType = regularToppingsType;
    }
}
