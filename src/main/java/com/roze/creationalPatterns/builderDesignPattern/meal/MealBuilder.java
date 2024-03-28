package com.roze.creationalPatterns.builderDesignPattern.meal;

//suppose there are two types of people
//One-Veg and Two-non veg
//so this abstract MealBuilder is implemented by two types
//so the food keeper can set the items
public abstract class MealBuilder {
    public abstract void addBiriyani();

    public abstract void addColdDrink();

    public abstract void addBread();

    public abstract void addCurry();

    public abstract Meal build();

}
