package org.example.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CustomLogger {
    private String className;
    private String fileName = "";

    public CustomLogger(String className) {
        System.out.println("Calling the Custom Logger constructor for the class: " + className);
        this.className = className;
    }

    public CustomLogger (String className, String fileName) {
        System.out.println("Calling the Custom Logger constructor");
        this.className = className;
        this.fileName = fileName;
    }

    /**
     * Take in an object and print it out or, fileName was specified, write to that file
     * @param message - the message/object that we want to print
     */
    public void log(Object message) {
        String formattedMessage = this.className + ": (" + new Date() +  ")" + message + "\n";
        if(fileName.isEmpty()) {
            System.out.println(formattedMessage);
        }
        else {
            try (BufferedWriter br = new BufferedWriter(new FileWriter(this.fileName, true))) {
                br.write(formattedMessage);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }


}
