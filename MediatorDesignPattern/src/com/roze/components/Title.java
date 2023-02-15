package com.roze.components;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Title extends JTextField implements Component {
    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {

    }

    @Override
    public String getName() {
        return "Title";
    }
}
