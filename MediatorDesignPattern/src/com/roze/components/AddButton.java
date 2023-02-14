package com.roze.components;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddButton extends JButton implements Component {

    public AddButton() {
        super("Add");
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
