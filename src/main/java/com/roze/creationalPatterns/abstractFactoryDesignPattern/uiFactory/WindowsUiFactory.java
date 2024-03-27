package com.roze.creationalPatterns.abstractFactoryDesignPattern.uiFactory;

import com.roze.creationalPatterns.abstractFactoryDesignPattern.Button;
import com.roze.creationalPatterns.abstractFactoryDesignPattern.CheckBox;
import com.roze.creationalPatterns.abstractFactoryDesignPattern.os.windows.WindowsButton;
import com.roze.creationalPatterns.abstractFactoryDesignPattern.os.windows.WindowsCheckBox;

public class WindowsUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        //this has returned only WindowsButton
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        //this has returned only WindowsCheckBox
        return new WindowsCheckBox();
    }
}
