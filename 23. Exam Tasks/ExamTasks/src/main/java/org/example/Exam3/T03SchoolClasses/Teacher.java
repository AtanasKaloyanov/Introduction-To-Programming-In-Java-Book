package org.example.Exam3.T03SchoolClasses;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String family;
    private List<Group> groups = new ArrayList<>();

    public Teacher(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return this.name + " " + this.family;
    }
}
