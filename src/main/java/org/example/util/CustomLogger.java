package org.example.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

public class CustomLogger {
    private String className;
    private String fileName = "";

    public CustomLogger(String className) {
        System.out.println("Calling the Custom Logger constructor for the class: " + className);
        this.className = className;
    }

    public CustomLogger (String className, String fileName) {
        System.out.println("Calling the Custom Logger constructor for the class: " + className + " and the file: " + fileName);
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomLogger that = (CustomLogger) o;
        // make sure that the fields match:
        return Objects.equals(className, that.className) && Objects.equals(fileName, that.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, fileName);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
