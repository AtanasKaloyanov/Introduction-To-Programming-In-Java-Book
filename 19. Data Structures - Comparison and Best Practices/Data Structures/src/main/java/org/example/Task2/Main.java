package org.example.Task2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\19. Data Structures - Comparison and Best Practices\\Data Structures - Comparison and Best Practices\\src\\main\\java\\org\\example\\Task2\\file1.txt";
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader bf = new BufferedReader(isr);
        String current;

        Map<String, List<Student>> map = new HashMap<>();

        while ((current = bf.readLine()) != null) {
            String[] information = current.split("\\s*\\|\\s*");
            String currentFirstName = information[0];
            String currentLastName = information[1];
            String currentCourse = information[2];

            Student currentStudent = new Student(currentFirstName, currentLastName);
            map.putIfAbsent(currentCourse, new ArrayList<>());
            map.get(currentCourse).add(currentStudent);
        }

        map.entrySet().forEach((entry) -> {
            String currentCourse = entry.getKey();
            List<Student> currentStudents = entry.getValue();
            Collections.sort(currentStudents);

            System.out.println("Course: " + currentCourse);
            System.out.print("Students: ");
            System.out.println(currentStudents.toString().replaceAll("[\\[\\]]", ""));
            System.out.println();
        });
    }
}
