package com.roze.components;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveButton extends JButton implements Component {
    public SaveButton() {
        super("Save");
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {

    }
    public String getName(){
        return "saveButton";
    }
}

