package com.roze.creationalPatterns.abstractFactoryDesignPattern.os.windows;

import com.roze.creationalPatterns.abstractFactoryDesignPattern.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
