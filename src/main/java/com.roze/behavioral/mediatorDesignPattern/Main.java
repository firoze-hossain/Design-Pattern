package com.roze.behavioral.mediatorDesignPattern;


import com.roze.behavioral.mediatorDesignPattern.components.*;
import com.roze.behavioral.mediatorDesignPattern.mediator.Editor;
import com.roze.behavioral.mediatorDesignPattern.mediator.Mediator;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Editor();
        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());
        mediator.createGUI();
    }
}
