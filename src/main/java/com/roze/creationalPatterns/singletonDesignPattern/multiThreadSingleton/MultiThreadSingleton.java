package com.roze.creationalPatterns.singletonDesignPattern.multiThreadSingleton;

//it is thread safe
//it does not waste memory
//This is pretty efficient singleton class
public class MultiThreadSingleton {
    private static MultiThreadSingleton instance = null;

    private MultiThreadSingleton() {

    }

    //don't using method level synchronization
    public static MultiThreadSingleton getInstance() {
        if (instance == null) {
            //this is class level object lock
            //using block level synchronization
            synchronized (MultiThreadSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }
}
