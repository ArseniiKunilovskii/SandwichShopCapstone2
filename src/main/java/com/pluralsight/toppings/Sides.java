package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

/**
 * Represents a side item, treated as a {@link Topping} (though its price calculation
 * is currently not implemented to return a non-zero value based on size).
 */
public class Sides extends Topping{
    private ToppingMethods.Sides sides;

    /**
     * Constructs a new Side item.
     * @param isExtra {@code true} if the side is requested as extra (conceptually), {@code false} otherwise.
     * @param sides The specific type of side.
     */
    public Sides(boolean isExtra, ToppingMethods.Sides sides) {
        super(isExtra);
        this.sides = sides;
    }

    /**
     * Calculates the price of the side.
     * Currently returns 0, implying sides are not priced based on sandwich size
     * in this method (or may be priced elsewhere).
     * @param size The size of the sandwich in inches (unused in this implementation).
     * @return Always returns 0.
     */
    @Override
    public double getPrice(int size) {
        return 0;
    }

    /**
     * Gets the type of side.
     * @return The {@link ToppingMethods.Sides}.
     */
    public ToppingMethods.Sides getSides() {
        return sides;
    }

    /**
     * Sets the type of side.
     * @param sides The new {@link ToppingMethods.Sides}.
     */
    public void setSides(ToppingMethods.Sides sides) {
        this.sides = sides;
    }

    /**
     * Gets the name of the side item, which is the string representation of the side type.
     * @return The name of the side.
     */
    public String getName() {
        return sides.toString();
    }
}