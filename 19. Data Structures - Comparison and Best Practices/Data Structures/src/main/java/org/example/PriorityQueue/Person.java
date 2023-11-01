package org.example.PriorityQueue;

public class Person // implements Comparable<Person>
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compareTo(Person p) {
//        if (this.age > p.age) {
//            return 1;
//        } else if (this.age == p.age) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
