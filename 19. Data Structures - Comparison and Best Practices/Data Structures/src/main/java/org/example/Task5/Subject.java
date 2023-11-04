package org.example.Task5;

import java.time.LocalTime;

public class Subject {
   private String name;
    private LocalTime start;
    private LocalTime end;

    public Subject(String name, LocalTime start, LocalTime end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
