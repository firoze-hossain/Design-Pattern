package com.roze.creationalPatterns.builderDesignPattern.meal;

public class Meal {
    private String curry;
    private String bread;
    private String biriyani;
    private String coldDrink;

    public String getCurry() {
        return curry;
    }

    public void setCurry(String curry) {
        this.curry = curry;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getBiriyani() {
        return biriyani;
    }

    public void setBiriyani(String biriyani) {
        this.biriyani = biriyani;
    }

    public String getColdDrink() {
        return coldDrink;
    }

    public void setColdDrink(String coldDrink) {
        this.coldDrink = coldDrink;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "curry='" + curry + '\'' +
                ", bread='" + bread + '\'' +
                ", biriyani='" + biriyani + '\'' +
                ", coldDrink='" + coldDrink + '\'' +
                '}';
    }
}
