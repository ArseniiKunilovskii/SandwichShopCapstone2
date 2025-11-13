package com.pluralsight.items;

/**
 * Abstract base class for all sellable items in the system (e.g., Sandwich, Drink, Chips).
 */
public abstract class Item {
    private int amount;

    /**
     * Calculates the total price of this item, including its quantity.
     * @return The total price as a double.
     */
    public abstract double getPrice();

    /**
     * Provides a string representation of the Item for display.
     * @return The formatted String representation.
     */
    @Override
    public abstract String toString();

    /**
     * Constructs a new Item with a specified amount.
     * @param amount The number of this item.
     */
    public Item(int amount) {
        this.amount = amount;
    }

    /**
     * Constructs a new Item with a default amount (typically 0, if not set later).
     */
    public Item() {
    }

    /**
     * Gets the amount (quantity) of this item.
     * @return The amount of the item.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount (quantity) of this item.
     * @param amount The new amount.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}