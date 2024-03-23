package com.roze.creationalPatterns.singletonDesignPattern.enums;

//enums are thread safe always
//all enums property are static
public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println("Cool");
    }
}
