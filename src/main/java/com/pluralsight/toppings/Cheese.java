package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

/**
 * Represents a cheese topping, which is a type of {@link Topping}.
 * It stores the specific type of cheese and calculates its price based on the sandwich size.
 */
public class Cheese extends Topping{
    private ToppingMethods.CheeseType cheeseType;

    /**
     * Constructs a new Cheese topping.
     * @param isExtra {@code true} if the cheese is extra, {@code false} otherwise.
     * @param cheeseType The specific type of cheese (e.g., Cheddar, Swiss).
     */
    public Cheese(boolean isExtra, ToppingMethods.CheeseType cheeseType) {
        super(isExtra);
        this.cheeseType = cheeseType;
    }

    /**
     * Calculates the price of the cheese topping based on the sandwich size.
     * The price varies depending on the size and whether it is an extra portion.
     * @param size The size of the sandwich in inches (4, 8, or 12).
     * @return The price of the cheese topping for the given size. Returns 0 if size is invalid.
     */
    @Override
    public double getPrice(int size) {
        switch (size){
            case 4:
                if(isExtra()){
                    return 1.05;
                }
                else {
                    return 0.75;
                }
            case 8:
                if(isExtra()){
                    return 2.10;
                }
                else {
                    return 1.5;
                }
            case 12:
                if(isExtra()){
                    return 3.15;
                }
                else {
                    return 2.25;
                }
            default:
                System.out.println("Something went wrong! Check size");
                break;
        }
        return 0;
    }

    /**
     * Gets the type of cheese.
     * @return The {@link ToppingMethods.CheeseType}.
     */
    public ToppingMethods.CheeseType getCheeseType() {
        return cheeseType;
    }

    /**
     * Gets the name of the cheese topping, which is the string representation of the cheese type.
     * @return The name of the cheese.
     */
    public String getName() {
        return cheeseType.toString();
    }

    /**
     * Sets the type of cheese.
     * @param cheeseType The new {@link ToppingMethods.CheeseType}.
     */
    public void setCheeseType(ToppingMethods.CheeseType cheeseType) {
        this.cheeseType = cheeseType;
    }
}