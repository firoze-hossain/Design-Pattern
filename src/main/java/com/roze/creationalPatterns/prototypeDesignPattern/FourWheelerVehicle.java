package com.roze.creationalPatterns.prototypeDesignPattern;
//this prototype have to support of cloneable
public class FourWheelerVehicle extends Vehicle {
    private boolean automatic;
    private boolean isDiesel;

    public FourWheelerVehicle(String engine, String model, Double price, boolean automatic, boolean isDiesel) {
        super(engine, model, price);
        this.automatic = automatic;
        this.isDiesel = isDiesel;
    }

    public FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }
}
