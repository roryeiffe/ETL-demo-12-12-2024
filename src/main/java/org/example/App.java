package org.example;

import org.example.models.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person(1, "Bob", 20, "NYC");
        System.out.println(person);
    }
}
