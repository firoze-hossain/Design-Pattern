package com.roze.creationalPatterns.singletonDesignPattern.breakSingleton.reflection;

import com.roze.creationalPatterns.singletonDesignPattern.enums.EnumSingleton;
import com.roze.creationalPatterns.singletonDesignPattern.lazyInitialization.LazySingleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        singletonReflection();
    }

    //using reflection to break down the singleton
    private static void singletonReflection() throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        //two hashcode value are different
        System.out.println("Reflected hashcode: " + lazySingleton.hashCode());
        System.out.println("Singleton instance: " + instance.hashCode());
        //enum is static
        //constructor of enum call by jvm automatically
        //it is also thread safe
        EnumSingleton.INSTANCE.doSomething();


    }
}
