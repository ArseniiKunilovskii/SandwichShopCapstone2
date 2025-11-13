package com.pluralsight.items;

import com.pluralsight.utilitlyMethods.ToppingMethods;

/**
 * Represents a bag of Chips, which is a sellable {@link Item}.
 * It stores the specific type of chips.
 */
public class Chips extends Item{
    private ToppingMethods.ChipsType chipsType;

    /**
     * Constructs a new Chips item with a specified amount and type.
     * @param amount The number of bags of chips.
     * @param chipsType The specific type of chips (e.g., BBQ, Salted).
     */
    public Chips(int amount, ToppingMethods.ChipsType chipsType) {
        super(amount);
        this.chipsType = chipsType;
    }

    /**
     * Constructs a new Chips item with a specified type, defaulting amount to 1.
     * @param chipsType The specific type of chips.
     */
    public Chips(ToppingMethods.ChipsType chipsType) {
        this.chipsType = chipsType;
    }

    /**
     * Gets the type of chips.
     * @return The {@link ToppingMethods.ChipsType}.
     */
    public ToppingMethods.ChipsType getChipsType() {
        return chipsType;
    }

    /**
     * Sets the type of chips.
     * @param chipsType The new {@link ToppingMethods.ChipsType}.
     */
    public void setChipsType(ToppingMethods.ChipsType chipsType) {
        this.chipsType = chipsType;
    }

    /**
     * Calculates the total price of the chips.
     * The unit price is $1.50.
     * @return The total price (1.50 * amount).
     */
    @Override
    public double getPrice() {
        return 1.5 * getAmount();
    }

    /**
     * Provides a formatted string representation of the Chips item.
     * @return A string showing the amount, description ("bag"), chips type, and total price.
     */
    @Override
    public String toString() {
        return String.format("%-2d %-8s %-15s - $%6.2f",
                getAmount(), "bag", chipsType, getPrice());
    }

}