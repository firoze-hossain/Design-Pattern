package com.roze.behavioral.templateDesignPattern;

//client class
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football game initialized.Start Playing...");
    }

    @Override
    public void startPlay() {
        System.out.println("Started Playing. Enjoy game...");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game played ended...");
    }
}
