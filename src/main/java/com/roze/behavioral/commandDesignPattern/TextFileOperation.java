package com.roze.behavioral.commandDesignPattern;

//command component
//it is the base interface, which is implemented by different concrete class
@FunctionalInterface
public interface TextFileOperation {
    String execute();
}
