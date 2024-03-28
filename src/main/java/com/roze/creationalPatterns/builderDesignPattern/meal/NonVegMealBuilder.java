package com.roze.creationalPatterns.builderDesignPattern.meal;

public class NonVegMealBuilder extends MealBuilder {
    private Meal meal;

    public NonVegMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addBiriyani() {
        this.meal.setBiriyani("Beef Biriyani");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Mojo");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Tondul");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Beef");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
