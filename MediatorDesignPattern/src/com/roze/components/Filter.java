package com.roze.components;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Filter extends JTextField implements Component {
    public Filter() {

    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        String start = getText();
    }

    private void searchElements(String s) {

    }

    @Override
    public String getName() {
        return "Filter";
    }
}
