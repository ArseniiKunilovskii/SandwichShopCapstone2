package com.pluralsight.items;

import com.pluralsight.toppings.Topping;
import com.pluralsight.utilitlyMethods.ToppingMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Sandwich, which is a sellable {@link Item}.
 * It stores the size, bread type, toppings, and whether it is toasted.
 */
public class Sandwich extends Item {
    private int size;
    private ToppingMethods.BreadType breadType;
    private ArrayList<Topping> toppings;
    private boolean isToasted;

    /**
     * Constructs a new Sandwich with all details.
     * @param amount The number of sandwiches.
     * @param size The size of the sandwich in inches (4, 8, or 12).
     * @param breadType The type of bread used.
     * @param toppings A list of {@link Topping} objects added to the sandwich.
     * @param isToasted {@code true} if the sandwich is toasted, {@code false} otherwise.
     */
    public Sandwich(int amount, int size, ToppingMethods.BreadType breadType, ArrayList<Topping> toppings, boolean isToasted) {
        super(amount);
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }

    /**
     * Constructs a default Sandwich, setting size to 0.
     */
    public Sandwich() {
        this.size = 0;
    }


    /**
     * Calculates the total price of the sandwich(es).
     * The price includes a base price based on size (4"=$5.50, 8"=$7.00, 12"=$8.50)
     * plus the sum of prices for all toppings.
     * @return The total price (sum of base price and topping prices) multiplied by the amount.
     * Returns 0 if the size is 0.
     */
    @Override
    public double getPrice() {
        double total = 0;
        if(size!=0) {
            switch (size) {
                case 4:
                    total += 5.5;
                    break;
                case 8:
                    total += 7;

                    break;
                case 12:
                    total += 8.5;
                    break;
            }
            List<Double> prices = toppings.stream().map(topping -> topping.getPrice(size)).toList();
            total += prices.stream().reduce(0.0, (temp, num) -> temp + num);
            return total * getAmount();
        }else {
            return 0;
        }
    }

    /**
     * Provides a detailed, formatted string representation of the Sandwich item,
     * including its size, bread, toasting status, total price, and a list of all toppings.
     * @return The formatted String representation. Returns "Item deleted" if size is 0.
     */
    @Override
    public String toString() {
        if (size != 0) {
            String toastedText = isToasted ? "Toasted" : "Not toasted";

            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%-2d %d\" %-10s %-10s - $%6.2f",
                    getAmount(), size, breadType, toastedText, getPrice()));

            for (Topping topping : toppings) {
                String extraText = topping.isExtra() ? " (extra)" : "";

                String toppingName = topping.getName();

                sb.append(String.format("\n  - %s%s", toppingName, extraText));
            }

            return sb.toString();
        }else {
            return "Item deleted";
        }
    }
}