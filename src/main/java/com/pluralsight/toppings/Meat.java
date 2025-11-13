package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

/**
 * Represents a meat topping, which is a type of {@link Topping}.
 * It stores the specific type of meat and calculates its price based on the sandwich size.
 */
public class Meat extends Topping {
    private ToppingMethods.MeatType meatType;

    /**
     * Constructs a new Meat topping.
     * @param isExtra {@code true} if the meat is extra, {@code false} otherwise.
     * @param meatType The specific type of meat (e.g., Steak, Ham).
     */
    public Meat(boolean isExtra , ToppingMethods.MeatType meatType) {
        super(isExtra);
        this.meatType = meatType;
    }

    /**
     * Gets the type of meat.
     * @return The {@link ToppingMethods.MeatType}.
     */
    public ToppingMethods.MeatType getMeatType() {
        return meatType;
    }

    /**
     * Sets the type of meat.
     * @param meatType The new {@link ToppingMethods.MeatType}.
     */
    public void setMeatType(ToppingMethods.MeatType meatType) {
        this.meatType = meatType;
    }

    /**
     * Calculates the price of the meat topping based on the sandwich size.
     * The price varies depending on the size and whether it is an extra portion.
     * @param size The size of the sandwich in inches (4, 8, or 12).
     * @return The price of the meat topping for the given size. Returns 0 if size is invalid.
     */
    @Override
    public double getPrice(int size) {
        switch (size){
            case 4:
                if(isExtra()){
                    return 1.5;
                }
                else {
                    return 1;
                }
            case 8:
                if(isExtra()){
                    return 3;
                }
                else {
                    return 2;
                }
            case 12:
                if(isExtra()){
                    return 4.5;
                }
                else {
                    return 3;
                }
            default:
                System.out.println("Something went wrong! Check size");
                break;
        }
        return 0;
    }

    /**
     * Gets the name of the meat topping, which is the string representation of the meat type.
     * @return The name of the meat.
     */
    public String getName() {
        return meatType.toString();
    }
}