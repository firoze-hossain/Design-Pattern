package com.roze.behavioral.templateDesignPattern;

//this is a template
//or we can say set of instructions
//there some methods client can modify itself
//but some methods are implemented in template itself
public abstract class Game {
    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
