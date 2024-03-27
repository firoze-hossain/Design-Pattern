package com.roze.creationalPatterns.abstractFactoryDesignPattern.os.mac;

import com.roze.creationalPatterns.abstractFactoryDesignPattern.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
