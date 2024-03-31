package com.roze.creationalPatterns.prototypeDesignPattern;
//this prototype have to support of cloneable
public class TwoWheelerVehicle extends Vehicle {
    private boolean isElectrical;

    public TwoWheelerVehicle(String engine, String model, Double price, boolean isElectrical) {
        super(engine, model, price);
        this.isElectrical = isElectrical;
    }
}
