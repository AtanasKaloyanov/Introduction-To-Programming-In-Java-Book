package org.example.Tasks.P04School;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Class> classes;
    private List<Teacher> teachers;

    public School(List<Class> classes, List<Teacher> teachers) {
        this.classes = classes;
        this.teachers = teachers;
    }
}
