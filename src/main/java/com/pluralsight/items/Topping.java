package com.pluralsight.items;

public abstract class Topping {
    private boolean isExtra;

    public Topping(boolean isExtra) {
        this.isExtra = isExtra;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    public abstract double getPrice(int size);
}
