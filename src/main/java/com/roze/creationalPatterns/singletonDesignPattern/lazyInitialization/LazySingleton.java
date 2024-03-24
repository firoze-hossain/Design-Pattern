package com.roze.creationalPatterns.singletonDesignPattern.lazyInitialization;

import java.io.Serializable;
//it is not thread safe
public class LazySingleton implements Serializable {
    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        //all threads will create new object
        //don't have logic to handle multiple thread

        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
