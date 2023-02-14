package com.roze.components;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends JButton implements Component {
    public DeleteButton() {
        super("Del");
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
