package org.example.Task2;

import org.example.PriorityQueue.Person;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\19. Data Structures - Comparison and Best Practices\\Data Structures\\src\\main\\java\\org\\example\\Task2\\file1.txt";
        File file = new File(path);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file, StandardCharsets.UTF_8);
            Map<String, Set<Student>> peopleByCourses = new HashMap<>();

            while (scanner.hasNextLine()) {
                String[] personData = scanner.nextLine().split(" \\| ");
                String firstName = personData[0];
                String lastName = personData[1];
                String course = personData[2];
                Student student = new Student(firstName, lastName, course);

                peopleByCourses.putIfAbsent(course, new TreeSet<>());
                Set<Student> students = peopleByCourses.get(course);
                students.add(student);
            }
            printStudentsByCourse(peopleByCourses);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void printStudentsByCourse(Map<String, Set<Student>> result) {
        result.entrySet()
                .stream()
                .forEach( (entry) -> {
                    String currentCourse = entry.getKey();
                    Set<Student> currentStudents = entry.getValue();
                    System.out.println("The students of the course " + currentCourse + " are:" +  System.lineSeparator()
                            + currentStudents.toString().replaceAll("[\\[\\]]", ""));
                });
    }
}
