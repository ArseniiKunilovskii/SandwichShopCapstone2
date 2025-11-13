package com.pluralsight.userInterface;

import com.pluralsight.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<Item> items;

    public void printOrder(){
        if (items.isEmpty()){
            System.out.println("\nYou didn't order anything yet!");
        }else {
            System.out.println("==============Your Order==============");
            for (int i = 0; i < items.size();i++){
                if (items.get(i)!=null){
                    System.out.println(items.get(i).toString());
                }
            }
            System.out.println("Your total is $" + getTotal());
            System.out.println("======================================");
        }
    }

    public double getTotal(){
        List<Double> prices = items.stream().map(Item::getPrice).toList();
        return prices.stream().reduce( 0.0,(temp, price) -> temp+price);
    }

    public Order() {
       items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
