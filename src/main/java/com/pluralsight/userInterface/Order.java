package com.pluralsight.userInterface;

import com.pluralsight.items.Item;

import java.util.ArrayList;

public class Order {
    private  int id;
    private ArrayList<Item> items;

    public void printOrder(){

    }

    public Order(int id, ArrayList<Item> items) {
        this.id = id;
        this.items = items;
    }

    public Order() {
    }

    public void addItem(Item item){
        items.add(item);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
