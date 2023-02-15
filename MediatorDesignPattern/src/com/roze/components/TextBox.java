package com.roze.components;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class TextBox extends JTextArea implements Component {
    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {

    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
