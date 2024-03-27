package com.roze.creationalPatterns.abstractFactoryDesignPattern.os.windows;

import com.roze.creationalPatterns.abstractFactoryDesignPattern.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Windows CheckBox");
    }
}
