package org.example.models;

public class Person {
    private int id;
    private String name;
    private int age;
    private String city;

    public Person (int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person(Person person) {
        this.id = person.id;
        this.name = person.name;
        this.age = person.age;
        this.city = person.city;

    }

    /**
     * Take the current Person instance and return an exact copy of it
     * @return the clone of the object so that is has the same values but not the same reference
     */
    public Person clone() {
        return new Person(this.id, this.name, this.age, this.city);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
