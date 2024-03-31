package com.roze.creationalPatterns.prototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

//when object creation is heavy and we need different type of object
//then we should use prototype design pattern
//we have base type and upon of base type we create different prototype with modification
//we have to make sure that other class can not be used by client
//client only use Prototype registry
public class VehicleRegistry {
    private static Map<String, Vehicle> mapVehicles = new HashMap<>();

    //creating base object of TwoWheeler and FourWheeler
    //so the client can use it
    static {
        mapVehicles.put("TWO", new TwoWheelerVehicle("Twist", "007", 1230.45, true));
        mapVehicles.put("Four", new FourWheelerVehicle("Fearest", "008", 1523.2, true, false));
    }

    //the client can pass the name of prototype in here
    // and they can clone the object based on their desired prototype
    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return mapVehicles.get(vehicle).clone();
    }
}
