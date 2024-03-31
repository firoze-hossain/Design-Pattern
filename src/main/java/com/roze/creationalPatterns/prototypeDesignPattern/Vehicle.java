package com.roze.creationalPatterns.prototypeDesignPattern;

//this is abstract prototype
//the base type class always be supportable by cloneable
public abstract class Vehicle implements Cloneable {
    private String engine;
    private String model;
    private Double price;

    public Vehicle(String engine, String model, Double price) {
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }
}
