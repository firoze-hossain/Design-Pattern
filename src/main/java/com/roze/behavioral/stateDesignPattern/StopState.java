package com.roze.behavioral.stateDesignPattern;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("The application is on stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop state";
    }
}
