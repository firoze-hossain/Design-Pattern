package com.roze.behavioral.mediatorDesignPatternNew;

public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String msg) {
        super(mediator, msg);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": sending message= " + msg);
        //passing user or component message through mediator and user it self
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": received message= " + msg);
    }
}
