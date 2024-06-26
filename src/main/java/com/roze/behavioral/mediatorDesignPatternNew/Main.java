package com.roze.behavioral.mediatorDesignPatternNew;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Firoze");
        User user2 = new UserImpl(mediator, "Millat");
        User user3 = new UserImpl(mediator, "Rayhan");
        User user4 = new UserImpl(mediator, "Imtiaze");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.send("Hello Friends");
    }
}
