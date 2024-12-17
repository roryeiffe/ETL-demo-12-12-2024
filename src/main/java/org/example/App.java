package org.example;

import org.example.models.Person;
import org.example.util.CustomDataParser;
import org.example.util.CustomFileReader;
import org.example.util.CustomLogger;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        Person person = new Person(1, "Bob", 20, "NYC");
//        System.out.println(person);

        CustomLogger customLogger = new CustomLogger("App.class");

        CustomFileReader customFileReader = CustomFileReader.getCustomFileReader();
        List<String> input = customFileReader.readFile("input.csv");

        CustomDataParser customDataParser = CustomDataParser.getcustomDataParser();
        Map<Integer, Person> outputData = customDataParser.parseData(input);
        customLogger.log(outputData);

        // Now, we read in the second data set:
        CustomFileReader customFileReader1 = CustomFileReader.getCustomFileReader();
        List<String> input2 = customFileReader1.readFile("input2.csv");
        CustomDataParser customDataParser1 = CustomDataParser.getcustomDataParser();
        Map<Integer, Person> map = customDataParser1.parseData(input2);
        customLogger.log(map);



    }
}
