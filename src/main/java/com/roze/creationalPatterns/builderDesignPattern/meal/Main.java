package com.roze.creationalPatterns.builderDesignPattern.meal;

public class Main {
    public static void main(String[] args) {
        //here Meal Director is the main to take the instruction for veg or non veg
        // Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal();
        Meal meal = new MealDirector(new NonVegMealBuilder()).prepareMeal();
        System.out.println(meal);
    }
}
