package com.roze.creationalPatterns.factoryDesignPattern;

public class LinuxOperatingSystem extends OperatingSystem {
    //we have to pass here Linux version and architecture
    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        //Linux commands or logic goes here
    }

    @Override
    public void removeDir(String dir) {
        //Linux commands or logic goes here
    }
}
