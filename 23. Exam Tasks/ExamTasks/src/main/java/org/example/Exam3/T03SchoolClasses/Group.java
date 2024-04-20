package org.example.Exam3.T03SchoolClasses;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;
    private Teacher teacher;

    public Group(String name, List<Student> students, Teacher teacher) {
        this.name = name;
        this.students = students;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "\nGroup " + "\"" + this.name.toLowerCase() + "\": " +  this.students.toString().replaceAll("[\\[\\]]", "")
                + ", teacher " + this.teacher + "." ;
    }
}
