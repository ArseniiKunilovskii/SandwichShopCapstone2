package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

public class Cheese extends Topping{
    private ToppingMethods.CheeseType cheeseType;

    public Cheese(boolean isExtra, ToppingMethods.CheeseType cheeseType) {
        super(isExtra);
        this.cheeseType = cheeseType;
    }

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

    public ToppingMethods.CheeseType getCheeseType() {
        return cheeseType;
    }

    public String getName() {
        return cheeseType.toString();
    }

    public void setCheeseType(ToppingMethods.CheeseType cheeseType) {
        this.cheeseType = cheeseType;
    }
}
