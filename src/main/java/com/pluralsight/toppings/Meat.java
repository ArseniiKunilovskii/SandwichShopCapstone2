package com.pluralsight.toppings;

import com.pluralsight.utilitlyMethods.ToppingMethods;

public class Meat extends Topping {
    private ToppingMethods.MeatType meatType;

    public Meat(boolean isExtra , ToppingMethods.MeatType meatType) {
        super(isExtra);
        this.meatType = meatType;
    }

    public ToppingMethods.MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(ToppingMethods.MeatType meatType) {
        this.meatType = meatType;
    }

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

    public String getName() {
        return meatType.toString();
    }
}
