package com.roze.creationalPatterns.builderDesignPattern.meal;

public class VegMealBuilder extends MealBuilder {
    private Meal meal;

    public VegMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addBiriyani() {
        this.meal.setBiriyani("Chicken");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Coke");
    }

    @Override
    public void addBread() {
        this.meal.setBread("None");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Prawns");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
