package org.example.Task2;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student student) {
        int compareNumber = this.lastName.compareTo(student.lastName);
        if (compareNumber == 0) {
            compareNumber = this.firstName.compareTo(student.firstName);
        }

        return compareNumber;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
