package com.roze.creationalPatterns.singletonDesignPattern.breakSingleton.serialization;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static SerializableSingleton instance = null;

    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        //all threads will create new object
        //don't have logic to handle multiple thread

        if (instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}
