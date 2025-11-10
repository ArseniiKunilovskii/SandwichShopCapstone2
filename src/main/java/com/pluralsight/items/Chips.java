package com.pluralsight.items;

import com.pluralsight.utilitlyMethods.ToppingMethods;

public class Chips extends Item{
    private ToppingMethods.ChipsType chipsType;

    public Chips(int amount, ToppingMethods.ChipsType chipsType) {
        super(amount);
        this.chipsType = chipsType;
    }

    public Chips(ToppingMethods.ChipsType chipsType) {
        this.chipsType = chipsType;
    }

    public ToppingMethods.ChipsType getChipsType() {
        return chipsType;
    }

    public void setChipsType(ToppingMethods.ChipsType chipsType) {
        this.chipsType = chipsType;
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
