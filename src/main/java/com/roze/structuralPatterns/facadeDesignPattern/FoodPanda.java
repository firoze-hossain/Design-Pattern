package com.roze.structuralPatterns.facadeDesignPattern;

//this mainly implements the Facade design pattern
//it creates the abstraction upon third party libraries
//it is created as a helper class to gain the abstraction of top that library
//so it reduces complexity to integrate third party library
//instead of using the full of third party library, we only use some of specific function of that library
public class FoodPanda {

    private Restaurant restaurant;
    private DeliveryTeam deliveryTeam;
    private DeliveryBoy deliveryBoy;

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickupOrder();
        deliveryBoy.deliverOrder();
    }
}
