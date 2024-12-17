package org.example.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomFileReader {

    // private instance of this class itself
    private static CustomFileReader customFileReader;
    private CustomLogger customLogger;

    // Make the constructor private so we can adhere to Singleton DP
    private CustomFileReader() {
        customLogger = LoggerFactory.getLogger("CustomFileReader.class");
        customLogger.log("CustomFileReader Constructor");
    }

    // when we try to retrieve this instance from elsewhere
    // Check if the object was already instantiated (if not, just create it)
    public static CustomFileReader getCustomFileReader() {
        if (customFileReader == null) {
            // we can access the private constructor because we are in that class
            customFileReader = new CustomFileReader();
        }
        // return the file reader either way
        return customFileReader;
    }

    /**
     *
     * @param filename - the name of the file to read data from
     * @return - a list of strings where each string is the data from one line of the file
     */
    public List<String> readFile(String filename) {
        List<String> output = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            // attempt to read lines from the file:
            // Read the first line but don't "do anything" with it because it is the header
            String line = br.readLine();
            while(true) {
                line = br.readLine();
                // if the line is null, we've reached the end of the input, so break:
                if(line == null) {
                    break;
                }
                else {
                    output.add(line);
                }
            }
        }
        catch(IOException ioException) {
            ioException.printStackTrace();
        }
        return output;
    }
}
