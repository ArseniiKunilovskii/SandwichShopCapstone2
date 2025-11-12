package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

public class RegularTopping extends Topping {
    private ToppingMethods.RegularToppingsType regularToppingsType;

    public RegularTopping(boolean isExtra, ToppingMethods.RegularToppingsType regularToppingsType) {
        super(isExtra);
        this.regularToppingsType = regularToppingsType;
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }

    public ToppingMethods.RegularToppingsType getRegularToppingsType() {
        return regularToppingsType;
    }

    public void setRegularToppingsType(ToppingMethods.RegularToppingsType regularToppingsType) {
        this.regularToppingsType = regularToppingsType;
    }
    public String getName() {
        return regularToppingsType.toString();
    }
}
