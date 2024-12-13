package org.example.util;

import org.example.models.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomDataParser {

    public CustomDataParser() {
        System.out.println("Custom Data Parser Constructor");
    }

    /**
     *
     * @param inputs - a list of Strings. Each string is a representation of a Person
     *               object that we want to convert to a Person object
     * @return - a map where each key is the id of the person and each value
     *          is the corresponding Person
     */
    public Map<Integer, Person> parseData(List<String> inputs) {
        Map<Integer, Person> outputData = new HashMap<>();
        for(String line: inputs) {
            // for each person, split based on the comma delimiter
            String [] fields = line.split(",");
            int id = Integer.valueOf(fields[0]);
            String name = fields[1];
            int age = Integer.valueOf(fields[2]);
            String city = fields[3];
            Person person = new Person(id, name, age, city);
            outputData.put(id, person);

        }
        return outputData;
    }
}
