package com.roze.behavioral.mediatorDesignPatternNew;
//this is the mediator
public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
