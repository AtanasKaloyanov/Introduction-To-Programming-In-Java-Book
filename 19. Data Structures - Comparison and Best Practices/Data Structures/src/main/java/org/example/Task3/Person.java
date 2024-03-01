package org.example.Task3;

public class Person implements Comparable<Person> {
    private String name;
    private String telNumber;

    public Person(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }

    @Override
    public String toString() {
        return this.name + " - " + this.telNumber;
    }
}
