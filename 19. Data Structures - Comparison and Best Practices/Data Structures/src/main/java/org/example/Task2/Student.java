package org.example.Task2;

public class Student implements Comparable<Student>  {
    private String firstName;
    private String lastName;
    private String course;

    public Student(String firstName, String lastName, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }


    @Override
    public int compareTo(Student o) {
        int compareNumber = this.lastName.compareTo(o.lastName);
        if (compareNumber == 0) {
            compareNumber = this.firstName.compareTo(o.firstName);
        }
        return compareNumber;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
