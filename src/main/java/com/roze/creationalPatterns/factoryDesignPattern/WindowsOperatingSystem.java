package com.roze.creationalPatterns.factoryDesignPattern;

public class WindowsOperatingSystem extends OperatingSystem {
    //we have to pass here windows version and architecture
    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        //windows command or logic goes here
    }

    @Override
    public void removeDir(String dir) {
        //windows command or logic goes here
    }
}
