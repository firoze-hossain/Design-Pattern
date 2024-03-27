package com.roze.creationalPatterns.abstractFactoryDesignPattern.uiFactory;

import com.roze.creationalPatterns.abstractFactoryDesignPattern.Button;
import com.roze.creationalPatterns.abstractFactoryDesignPattern.CheckBox;
import com.roze.creationalPatterns.abstractFactoryDesignPattern.os.mac.MacButton;
import com.roze.creationalPatterns.abstractFactoryDesignPattern.os.mac.MacCheckBox;

public class MacUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        //this has returned only MacButton
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        //this has returned only MacCheckBox
        return new MacCheckBox();
    }
}
