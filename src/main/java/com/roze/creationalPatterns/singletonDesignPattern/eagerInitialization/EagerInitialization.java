package com.roze.creationalPatterns.singletonDesignPattern.eagerInitialization;

//it can handle multiple thread but may be caused waste of memory
//when thread call the instance of class it at that time jvm will create object
//but we don't use the property of object it will totally wasted
public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {

    }

    public static EagerInitialization getInstance() {
        return instance;
    }
}
