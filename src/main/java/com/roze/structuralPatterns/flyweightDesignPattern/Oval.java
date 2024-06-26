package com.roze.structuralPatterns.flyweightDesignPattern;

import java.awt.*;

public class Oval implements Shape {
    //this is intrinsic property
    private boolean fill;

    public Oval(boolean f) {
        this.fill = f;
        System.out.println("Creating oval with fill: " + f);
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        //if fill is true then all properties of fill will be set
        if (fill) {
            circle.fillOval(x, y, width, height);
        }
    }
}
