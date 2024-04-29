package com.roze.behavioral.stateDesignPattern;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("The application is on start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
