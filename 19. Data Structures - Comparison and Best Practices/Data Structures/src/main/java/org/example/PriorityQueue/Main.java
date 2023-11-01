package org.example.PriorityQueue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        Person first = new Person("Atanas", 30);
        Person second = new Person("Persho", 10);
        Person third = new Person("Mara", 19);
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(Comparator.comparing(Person::getAge));
        priorityQueue.addAll(List.of(first, second, third));

        while (!priorityQueue.isEmpty()) {
            Person current = priorityQueue.poll();
            System.out.println(current);
        }
    }
}
