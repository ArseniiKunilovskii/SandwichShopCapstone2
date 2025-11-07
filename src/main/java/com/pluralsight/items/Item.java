package com.pluralsight.items;

public abstract class Item {
    private int amount;

    public abstract double getPrice();

    public Item(int amount) {
        this.amount = amount;
    }

    public Item() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
