package com.roze.behavioral.mediatorDesignPatternNew;

//the component class has it's own implementation
public abstract class User {
    //the reference of of mediator or extra object of mediator where component
    // or user can communicate each other through mediator
    protected ChatMediator mediator;
    //component class property
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    //component class own method
    public abstract void send(String msg);

    //component class own method
    public abstract void receive(String msg);
}
