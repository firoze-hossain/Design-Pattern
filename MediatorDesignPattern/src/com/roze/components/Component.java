package com.roze.components;

import com.roze.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}
