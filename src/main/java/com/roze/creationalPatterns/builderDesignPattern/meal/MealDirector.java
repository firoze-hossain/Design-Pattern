package com.roze.creationalPatterns.builderDesignPattern.meal;

//MealDirector is main part who takes the order or input from customer
//if customer order veg meal he will take order's it prepare veg meal
//if customer order non-veg meal he will take order's it prepare non-veg meal
public class MealDirector {
    private MealBuilder mealBuilder;

    //here we have to pass Veg/non veg builder
    //then it will automatically return what customer have done order
    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal() {
        mealBuilder.addBiriyani();
        mealBuilder.addBread();
        mealBuilder.addColdDrink();
        mealBuilder.addCurry();
        return mealBuilder.build();
    }
}
