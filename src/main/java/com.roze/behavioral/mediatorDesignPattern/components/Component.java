package com.roze.behavioral.mediatorDesignPattern.components;

import com.roze.behavioral.mediatorDesignPattern.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
