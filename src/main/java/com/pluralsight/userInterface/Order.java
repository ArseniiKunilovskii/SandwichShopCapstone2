package com.pluralsight.userInterface;

import com.pluralsight.items.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer's order, containing a list of {@link Item} objects.
 * It provides functionality for managing and calculating the order total.
 */
public class Order {
    private ArrayList<Item> items;

    /**
     * Prints the contents of the order to the console, including each item's details
     * and the calculated total price.
     */
    public void printOrder(){
        if (items.isEmpty()){
            System.out.println("\nYou didn't order anything yet!");
        }else {
            System.out.println("==============Your Order==============");
            for (Item item : items) {
                if (item != null) {
                    System.out.println(item.toString());
                }
            }
            System.out.println("Your total is $" + getTotal());
            System.out.println("======================================");
        }
    }

    /**
     * Calculates the grand total price of all items in the order.
     * @return The total price of the order as a double.
     */
    public double getTotal(){
        List<Double> prices = items.stream().map(Item::getPrice).toList();
        return prices.stream().reduce( 0.0,(temp, price) -> temp+price);
    }

    /**
     * Constructs a new empty Order.
     */
    public Order() {
        items = new ArrayList<>();
    }

    /**
     * Adds an item to the order list.
     * @param item The {@link Item} to add.
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * Checks if the order is empty.
     * @return {@code true} if the order contains no items, {@code false} otherwise.
     */
    public boolean isEmpty(){
        return items.isEmpty();
    }

    /**
     * Gets the list of items currently in the order.
     * @return The {@link ArrayList} of {@link Item} objects.
     */
    public ArrayList<Item> getItems() {
        return items;
    }
}