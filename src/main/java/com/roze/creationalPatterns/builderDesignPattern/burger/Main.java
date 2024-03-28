package com.roze.creationalPatterns.builderDesignPattern.burger;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .size("Large")
                .extraCheese(false)
                .egg(true)
                .lettuce(false)
                .mayonnaise(true)
                .build();
        System.out.println(burger);
    }
}
