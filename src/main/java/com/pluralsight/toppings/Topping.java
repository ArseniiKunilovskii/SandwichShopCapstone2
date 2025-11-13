package com.pluralsight.toppings;

/**
 * Abstract base class for all toppings that can be added to an item (e.g., a Sandwich).
 */
public abstract class Topping {
    private boolean isExtra;

    /**
     * Constructs a new Topping.
     * @param isExtra {@code true} if the topping is an extra portion, {@code false} otherwise.
     */
    public Topping(boolean isExtra) {
        this.isExtra = isExtra;
    }

    /**
     * Checks if the topping is an extra portion.
     * @return {@code true} if it's extra, {@code false} otherwise.
     */
    public boolean isExtra() {
        return isExtra;
    }

    /**
     * Sets whether the topping is an extra portion.
     * @param extra {@code true} to set it as extra, {@code false} otherwise.
     */
    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    /**
     * Calculates the price of the topping based on the size of the item it is applied to.
     * @param size The size of the item (e.g., sandwich size in inches).
     * @return The price of the topping.
     */
    public abstract double getPrice(int size);

    /**
     * Gets the name of the topping.
     * @return The name of the topping as a String.
     */
    public abstract String getName();
}