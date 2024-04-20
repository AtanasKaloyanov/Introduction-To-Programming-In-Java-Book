package org.example.Exam3.T03SchoolClasses;

public class Student {
    private String name;
    private String family;

    public Student(String name, String family) {
        this.name = name;
        this.family = family;
    }

    @Override
    public String toString() {
        return this.name + " " + this.family;
    }
}
