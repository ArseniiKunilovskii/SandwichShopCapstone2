package com.pluralsight.userInterface;

import com.pluralsight.items.Item;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;

    public void printOrder(){

    }

    public Order() {
       items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
