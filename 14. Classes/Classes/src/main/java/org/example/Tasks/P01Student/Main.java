package org.example.Tasks.P01Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("a", "b", "c", "d", "e");
        Student student2 = new Student("a", "b", "c", "d", "e");
        System.out.println(Student.getObjects());
        System.out.println(student2);
    }
}
