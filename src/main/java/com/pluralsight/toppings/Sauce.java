package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

/**
 * Represents a sauce topping, which is a type of {@link Topping}.
 * This topping currently has a price of 0 regardless of size.
 */
public class Sauce extends Topping{
    private ToppingMethods.SaucesType saucesType;

    /**
     * Constructs a new Sauce topping.
     * @param isExtra {@code true} if the sauce is requested as extra (conceptually), {@code false} otherwise.
     * @param saucesType The specific type of sauce (e.g., Mayo, Mustard).
     */
    public Sauce(boolean isExtra, ToppingMethods.SaucesType saucesType) {
        super(isExtra);
        this.saucesType = saucesType;
    }

    /**
     * Gets the type of sauce.
     * @return The {@link ToppingMethods.SaucesType}.
     */
    public ToppingMethods.SaucesType getSaucesType() {
        return saucesType;
    }

    /**
     * Sets the type of sauce.
     * @param saucesType The new {@link ToppingMethods.SaucesType}.
     */
    public void setSaucesType(ToppingMethods.SaucesType saucesType) {
        this.saucesType = saucesType;
    }

    /**
     * Calculates the price of the sauce topping.
     * Currently returns 0, implying sauces are free or priced elsewhere.
     * @param size The size of the sandwich in inches (unused in this implementation).
     * @return Always returns 0.
     */
    @Override
    public double getPrice(int size) {
        return 0;
    }

    /**
     * Gets the name of the sauce topping, which is the string representation of the sauce type.
     * @return The name of the sauce.
     */
    public String getName() {
        return saucesType.toString();
    }
}