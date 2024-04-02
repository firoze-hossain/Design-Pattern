package com.roze.structuralPatterns.adapterDesignPatternNew;

public class Main {
    public static void main(String[] args) {
        Pathao pathao = new Pathao();
        //pass food item
        pathao.addItems(new FoodItem());
        //the grocery product will be converted to item
        pathao.addItems(new GroceryItemAdapter(new GroceryProduct()));
    }
}
