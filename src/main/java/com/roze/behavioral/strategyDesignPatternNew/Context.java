package com.roze.behavioral.strategyDesignPatternNew;

public class Context {
    private Strategy strategy;

    //strategy pass along context
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
