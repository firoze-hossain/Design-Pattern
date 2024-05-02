package com.roze.behavioral.templateDesignPattern;

//client
public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket game initialized.Start Playing...");
    }

    @Override
    public void startPlay() {
        System.out.println("Started Playing. Enjoy game...");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game played ended...");
    }
}
