package com.pluralsight.items;

import com.pluralsight.utilitlyMethods.ToppingMethods;

/**
 * Represents a Drink, which is a sellable {@link Item}.
 * It stores the size and type of drink.
 */
public class Drink extends Item{
    private String size;
    private ToppingMethods.DrinkType drinkType;

    /**
     * Constructs a new Drink with a specified amount, size, and type.
     * @param amount The number of drinks.
     * @param size The size of the drink ("small", "medium", or "large").
     * @param drinkType The specific type of drink.
     */
    public Drink(int amount, String size, ToppingMethods.DrinkType drinkType) {
        super(amount);
        this.size = size;
        this.drinkType = drinkType;
    }

    /**
     * Constructs a new Drink with a specified size and type, defaulting amount to 1.
     * @param size The size of the drink ("small", "medium", or "large").
     * @param drinkType The specific type of drink.
     */
    public Drink(String size, ToppingMethods.DrinkType drinkType) {
        this.size = size;
        this.drinkType = drinkType;
    }

    /**
     * Constructs an empty or default Drink, setting amount to 0 and size to "null".
     */
    public Drink() {
        super(0);
        size="null";
    }

    /**
     * Calculates the total price of the drink(s).
     * The unit price is determined by the size (small=$2.00, medium=$2.50, large=$3.00).
     * @return The total price (unit price * amount). Returns 0 if size is "null" or invalid.
     */
    @Override
    public double getPrice() {
        double price;
        if(size.equalsIgnoreCase("null")){
            price= 0;
        }
        else if (size.equalsIgnoreCase("small")){
            price=2.00;
        }
        else if (size.equalsIgnoreCase("Medium")){
            price= 2.50;
        }else if (size.equalsIgnoreCase("Large")){
            price= 3.00;
        }else {
            System.out.println("Something went wrong, it is on us!");
            price= 0;
        }
        return price*getAmount();
    }

    /**
     * Provides a formatted string representation of the Drink item.
     * @return A string showing the amount, size, drink type, and total price.
     */
    @Override
    public String toString() {
        return String.format("%-2d %-8s %-15s - $%6.2f",
                getAmount(), size, drinkType, getPrice());
    }

    /**
     * Gets the size of the drink.
     * @return The size as a String.
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the size of the drink.
     * @param size The new size as a String.
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Gets the type of drink.
     * @return The {@link ToppingMethods.DrinkType}.
     */
    public ToppingMethods.DrinkType getDrinkType() {
        return drinkType;
    }

    /**
     * Sets the type of drink.
     * @param drinkType The new {@link ToppingMethods.DrinkType}.
     */
    public void setDrinkType(ToppingMethods.DrinkType drinkType) {
        this.drinkType = drinkType;
    }
}