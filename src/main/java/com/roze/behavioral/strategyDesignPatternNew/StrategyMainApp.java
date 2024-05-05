package com.roze.behavioral.strategyDesignPatternNew;

//Strategy design pattern is part of behavioral design pattern
//It defines set of algorithms for different sub class, that they use it interchangeably
public class StrategyMainApp {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("5+2=" + context.executeStrategy(5, 2));
        context = new Context(new MultiplyOperation());
        System.out.println("5*2=" + context.executeStrategy(5, 2));
        context = new Context(new SubtractOperation());
        System.out.println("5-2=" + context.executeStrategy(5, 2));
    }
}
