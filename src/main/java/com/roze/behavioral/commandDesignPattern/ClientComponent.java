package com.roze.behavioral.commandDesignPattern;

//command design pattern is a behavioural design pattern
// it's main purpose is it will convert request into command
//and that command is executed by business logic
//This is the client component
public class ClientComponent {
    public static void main(String[] args) {
        TextFileOperationInvoker textFileOperationInvoker = new TextFileOperationInvoker();
        String open = textFileOperationInvoker.executeOperation(new OpenTextFileOperation(new TextFile("hello.txt")));
        System.out.println(open);
        String save = textFileOperationInvoker.executeOperation(new SaveTextFileOperation(new TextFile("Hi.txt")));
        System.out.println(save);
    }
}
