package org.example.Exam3.T03SchoolClasses;

import java.util.List;

public class School {
    private String name;
    private List<Teacher> teachers;
    private List<Group> groups;
    private List<Student> students;

    public School(String name, List<Teacher> teachers,
                  List<Group> groups, List<Student> students) {
        this.name = name;
        this.teachers = teachers;
        this.groups = groups;
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("School " + "\"").append(this.name).append("\". ").append("Teachers: ").append(this.teachers.toString().replaceAll("[\\[\\]]", "")).append(".");
        for (int i = 0; i < this.groups.size(); i++) {
            Group currentGroup = this.groups.get(i);
            result.append(currentGroup);
        }
        return result.toString();
    }
}
