package com.roze.behavioral.commandDesignPattern;

import java.util.ArrayList;
import java.util.List;

//this is invoker or executor component
//this is called by client component to execute which command or add new command to list
public class TextFileOperationInvoker {
    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        //it will save new command to the list
        textFileOperations.add(textFileOperation);
        //and it will execute the command
        return textFileOperation.execute();
    }
}
