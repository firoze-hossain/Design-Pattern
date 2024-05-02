package com.roze.behavioral.templateDesignPattern;

public class TemplateApplication {
    public static void main(String[] args) {
        Game game = new Cricket();
        //it will invoked all the methods implemented by client in Football
        game.play();
        System.out.println();
        game = new Football();
        //it will invoked all the methods implemented by client in Cricket
        game.play();
    }
}
