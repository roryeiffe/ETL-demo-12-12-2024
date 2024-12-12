package org.example.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomFileReader {

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
            // TODO: make this a log statement
            ioException.printStackTrace();
        }
        return output;
    }
}
