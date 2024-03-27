package com.roze.creationalPatterns.abstractFactoryDesignPattern.os.mac;

import com.roze.creationalPatterns.abstractFactoryDesignPattern.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}
