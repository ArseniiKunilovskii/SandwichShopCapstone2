package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

/**
 * Represents a regular, non-meat/non-cheese topping, which is a type of {@link Topping}.
 * This topping currently has a price of 0 regardless of size.
 */
public class RegularTopping extends Topping {
    private ToppingMethods.RegularToppingsType regularToppingsType;

    /**
     * Constructs a new RegularTopping.
     * @param isExtra {@code true} if the topping is extra, {@code false} otherwise.
     * @param regularToppingsType The specific type of regular topping (e.g., Lettuce, Onion).
     */
    public RegularTopping(boolean isExtra, ToppingMethods.RegularToppingsType regularToppingsType) {
        super(isExtra);
        this.regularToppingsType = regularToppingsType;
    }

    /**
     * Calculates the price of the regular topping.
     * Currently returns 0, implying these toppings are free or priced elsewhere.
     * @param size The size of the sandwich in inches (unused in this implementation).
     * @return Always returns 0.
     */
    @Override
    public double getPrice(int size) {
        return 0;
    }

    /**
     * Gets the type of regular topping.
     * @return The {@link ToppingMethods.RegularToppingsType}.
     */
    public ToppingMethods.RegularToppingsType getRegularToppingsType() {
        return regularToppingsType;
    }

    /**
     * Sets the type of regular topping.
     * @param regularToppingsType The new {@link ToppingMethods.RegularToppingsType}.
     */
    public void setRegularToppingsType(ToppingMethods.RegularToppingsType regularToppingsType) {
        this.regularToppingsType = regularToppingsType;
    }

    /**
     * Gets the name of the regular topping, which is the string representation of the topping type.
     * @return The name of the regular topping.
     */
    public String getName() {
        return regularToppingsType.toString();
    }
}