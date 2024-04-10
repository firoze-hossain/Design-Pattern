package com.roze.behavioral.commandDesignPattern;

//this is the receiver
//this mainly/actually executes the request or command
public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening file: " + name;
    }

    public String save() {
        return "Saving file: " + name;
    }
}
