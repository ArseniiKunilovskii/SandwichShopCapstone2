package com.pluralsight.items;

import com.pluralsight.utilitlyMethods.UtilityMethods;

public class Meat extends Topping{
    private UtilityMethods.meatType meatType;

    public Meat(boolean isExtra ,UtilityMethods.meatType meatType) {
        super(isExtra);
        this.meatType = meatType;
    }

    public UtilityMethods.meatType getMeatType() {
        return meatType;
    }

    public void setMeatType(UtilityMethods.meatType meatType) {
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
}
