package com.roze.creationalPatterns.abstractFactoryDesignPattern;

import com.roze.creationalPatterns.abstractFactoryDesignPattern.uiFactory.MacUiFactory;
import com.roze.creationalPatterns.abstractFactoryDesignPattern.uiFactory.WindowsUiFactory;

public class Main {
    public static void main(String[] args) {
        //in here we pass the WindowsUiFactory/MacUiFactory class as argument
        //the Application is abstract class(Main Factory->Factory of Others Factory)
        // So we pass another factory in Main Application factory to build specific factory's object
      //  Application application = new Application(new WindowsUiFactory());
        Application application = new Application(new MacUiFactory());
        application.paint();
    }
}
