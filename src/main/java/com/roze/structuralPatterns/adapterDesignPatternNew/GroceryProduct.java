package com.roze.structuralPatterns.adapterDesignPatternNew;

public class GroceryProduct implements GroceryItem{
    @Override
    public String getGroceryName() {
        return null;
    }

    @Override
    public double getGroceryPrice() {
        return 0;
    }

    @Override
    public String getStoreName() {
        return null;
    }
}
