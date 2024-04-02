package com.roze.structuralPatterns.adapterDesignPatternNew;

//it will convert grocery item to item
//it give a solution for incompatible interface
//adapter design pattern makes incompatible interface as adapted
public class GroceryItemAdapter implements Item {
    private GroceryItem groceryItem;

    //take grocery item as input and returned back as item
    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName() {
        return groceryItem.getGroceryName();
    }

    @Override
    public double getPrice() {
        return groceryItem.getGroceryPrice();
    }

    @Override
    public String getRestaurantName() {
        return groceryItem.getStoreName();
    }
}
