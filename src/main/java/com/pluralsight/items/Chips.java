package com.pluralsight.items;

import com.pluralsight.utilitlyMethods.UtilityMethods;

public class Chips extends Item{
    private UtilityMethods.chipsType chipsType;

    public Chips(int amount, UtilityMethods.chipsType chipsType) {
        super(amount);
        this.chipsType = chipsType;
    }

    public Chips(UtilityMethods.chipsType chipsType) {
        this.chipsType = chipsType;
    }

    public UtilityMethods.chipsType getChipsType() {
        return chipsType;
    }

    public void setChipsType(UtilityMethods.chipsType chipsType) {
        this.chipsType = chipsType;
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
