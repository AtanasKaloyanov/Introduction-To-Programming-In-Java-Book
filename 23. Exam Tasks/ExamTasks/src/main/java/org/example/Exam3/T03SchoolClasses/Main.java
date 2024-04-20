package org.example.Exam3.T03SchoolClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // 1. Students
        Student student1 = new Student("Ivan", "Petrov");
        Student student2 = new Student("Vasil", "Todorov");
        Student student3 = new Student("Elena", "Mihaylova");
        Student student4 = new Student("Radoslav", "Georgiev");
        Student student5 = new Student("Milena", "Stefanova");

        List<Student> englishStudents = new ArrayList<>(List.of(student1, student2,
                student3, student4, student5));

        Student student6 = new Student("Petar", "Petrov");
        Student student7 = new Student("Vasil", "Vasilev");

        List<Student> frenchStudents = new ArrayList<>(List.of(student6, student7));

        Student student8 = new Student("Milka", "Koleva");
        Student student9 = new Student("Pencho", "Toshev");
        Student student10 = new Student("Iva", "Borisova");
        Student student11= new Student("Milena", "Ivanova");
        Student student12 = new Student("Hristo", "Todorov");

        List<Student> informaticsStudents = new ArrayList<>(List.of(student8, student9,
                student10, student11, student12));

        // 2. Teachers
        Teacher hristinaNikolova = new Teacher("Hristina", "Nikolova");
        Teacher dimitarGeorgiev = new Teacher("Dimitar", "Georgiev");

        // 3. Groups
        Group english = new Group("English", englishStudents, hristinaNikolova);
        Group french = new Group("French", frenchStudents, hristinaNikolova);
        Group informatics = new Group("Informatics", informaticsStudents, dimitarGeorgiev);

        // Adding the groups to the teachers
        List<Group> languages = new ArrayList<>(List.of(english, french));
        List<Group> computerScience = new ArrayList<>(List.of(informatics));
        hristinaNikolova.setGroups(languages);
        dimitarGeorgiev.setGroups(computerScience);

        // 4. School
        List<Teacher> teachers = new ArrayList<>(List.of(dimitarGeorgiev, hristinaNikolova));
        List<Group> allGroups = new ArrayList<>(List.of(english, french, informatics));
        List<Student> allStudents = new ArrayList<>(List.of(student1, student2, student3, student4, student5,
                student6, student7, student8, student9, student10, student11, student12));
        School school = new School("Freedom", teachers, allGroups, allStudents);

        System.out.println(school);
    }
}

/*
 The students are separated into groups
 Every group has one teacher

 class Student

 1. String name
 2. String family

 class Group

 1. String name
 2. List<Students> students

 class Teacher

 1. String name
 2. String family
 3. List<Group> groups

 class School

 1. String name
 2. List<Teacher> teachers
 3. List<Group> groups
 4. List<Student> students

 */



