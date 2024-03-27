package com.roze.creationalPatterns.abstractFactoryDesignPattern;

import com.roze.creationalPatterns.abstractFactoryDesignPattern.uiFactory.UiFactory;

public class Application {
    //The main factory has all properties like other factory(Like- MacUiFactory, WindowsUiFactory)
    private CheckBox checkBox;
    public Button button;

    //as constructor we have pass UiFactory Interface
    // when we call the Application class, so we can Pass here any implemented class of UiFactory Interface
    public Application(UiFactory uiFactory) {
        checkBox = uiFactory.createCheckBox();
        button = uiFactory.createButton();
    }

    //this is method that has called all other methods
    public void paint() {
        checkBox.paint();
        button.paint();
    }
}
