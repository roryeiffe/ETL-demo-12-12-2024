package org.example;

import org.example.models.Person;
import org.example.util.CustomDataParser;
import org.example.util.CustomFileReader;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        Person person = new Person(1, "Bob", 20, "NYC");
//        System.out.println(person);

        CustomFileReader customFileReader = new CustomFileReader();
        List<String> input = customFileReader.readFile("input.csv");

        CustomDataParser customDataParser = new CustomDataParser();
        Map<Integer, Person> outputData = customDataParser.parseData(input);
        System.out.println(outputData);



    }
}
