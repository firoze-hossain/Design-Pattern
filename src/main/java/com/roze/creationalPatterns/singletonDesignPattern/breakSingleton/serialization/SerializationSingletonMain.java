package com.roze.creationalPatterns.singletonDesignPattern.breakSingleton.serialization;

import com.roze.creationalPatterns.singletonDesignPattern.lazyInitialization.LazySingleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class SerializationSingletonMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        singletonSerialization();

    }


    //using serialization to break down the singleton
    private static void singletonSerialization() throws IOException, ClassNotFoundException {
        //cause serialization and deserialization returns two different object
        //but it should return one single object
        //this is violating the principle of singleton
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Object.obj"));
        LazySingleton deserializedSingleton = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1: " + lazySingleton.hashCode());
        System.out.println("Object 2: " + deserializedSingleton.hashCode());

        //there is method call readSolve() from object class
        //when we deserialize object the readSolve() method auto called by jvm
        //and it return the same object what is created once
        //this is keeping the principle of singleton
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("Object1.obj"));
        objectOutputStream1.writeObject(serializableSingleton);
        objectOutputStream1.close();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("Object1.obj"));
        SerializableSingleton deserializableSingleton = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("SerializableSingleton Object 1: " + serializableSingleton.hashCode());
        System.out.println("SerializableSingleton Object 2: " + deserializableSingleton.hashCode());
    }


}
