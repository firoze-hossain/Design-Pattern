package com.roze.creationalPatterns.abstractFactoryDesignPattern.uiFactory;

import com.roze.creationalPatterns.abstractFactoryDesignPattern.Button;
import com.roze.creationalPatterns.abstractFactoryDesignPattern.CheckBox;

public interface UiFactory {
    Button createButton();

    CheckBox createCheckBox();
}
