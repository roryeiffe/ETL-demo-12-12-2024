package org.example.util;

import java.util.Date;

public class CustomLogger {
    private String className;
    private String fileName;

    public CustomLogger(String className) {
        this.className = className;
    }

    public CustomLogger (String className, String fileName) {
        this.className = className;
        this.fileName = fileName;
    }

    /**
     * Take in an object and print it out or, fileName was specified, write to that file
     * @param message - the message/object that we want to print
     */
    public void log(Object message) {
        System.out.println(this.className + ": (" + new Date() +  ")" + message);
    }


}
