package com.roze.creationalPatterns.factoryDesignPattern;

public class OperatingSystemFactory {
    //we don't the operating system factory or object of it
    // we need the product of it
    //so we have the factory constructor private
    private OperatingSystemFactory() {

    }

    //creation of Object
//    OperatingSystem windows7 = OperatingSystemFactory.getInstance("Windows", "Windows 7", "x64");
//    OperatingSystem linuxUbuntu = OperatingSystemFactory.getInstance("Linux", "Ubuntu 22", "x64");


    //we can get product from the factory using getInstance() by passing argument type,version and architecture
    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "Windows":
                return new WindowsOperatingSystem(version, architecture);
            case "Linux":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("Os is not supported");
        }
    }
}
