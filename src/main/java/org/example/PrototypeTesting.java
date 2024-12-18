package org.example;

import org.example.models.Person;

public class PrototypeTesting {
    public static void main(String[] args) {
        Person person = new Person(1, "Timmy", 20, "LA");
        // this works here, but it is a bit tedious but it also wouldn't work if the Person class
        // had any inaccessible (private without a getter/setter) fields that we wanted to copy
        Person personCopy = new Person(person.getId(), person.getName(), person.getAge(), person.getCity());

        // copying the fields, not the reference
        Person clone = person.clone();
        // make a shallow clone, copying the reference
        Person shallow = person;

        System.out.println(clone);

        // Test out how the reference relates to the clone:
        System.out.println("clone == original: " + (person == clone));

        person.setName("Bob");
        System.out.println("original person after change: " + person);
        System.out.println("shallow clone after changing the original: " + shallow);
        System.out.println("deep clone after changing the original: " + clone);

    }
}
