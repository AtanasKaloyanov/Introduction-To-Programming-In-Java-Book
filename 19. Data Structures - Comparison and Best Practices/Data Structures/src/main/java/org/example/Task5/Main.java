package org.example.Task5;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        // 10:30 - 12:00 - Subject 1
        // 12:15 - 13:45 - Subject 2
        // 14:00 - 15:30 - Subject 3
        Subject first = new Subject("first", LocalTime.of(10, 30), LocalTime.of(12, 0));
        Subject second = new Subject("second", LocalTime.of(12, 15), LocalTime.of(13, 45));
        Subject third = new Subject("third", LocalTime.of(14, 0), LocalTime.of(15, 30));

        // key - start           value - Subject
        // 10:30                 Subject 1
        // 12:15                 Subject 2
        // 14:00                 Subject 3

        TreeMap<LocalTime, Subject> map1 = new TreeMap<>();
        map1.put(first.getStart(), first);
        map1.put(second.getStart(), second);
        map1.put(third.getStart(), third);

        // key - end                value - Subject
        // 12: 00                 Subject 1
        // 13: 45                 Subject 2
        // 15: 30                 Subject 3

        TreeMap<LocalTime, Subject> map2 = new TreeMap<>();
        map2.put(first.getEnd(), first);
        map2.put(second.getEnd(), second);
        map2.put(third.getEnd(), third);

        // 11:59 - 12:10
        SortedMap<LocalTime, Subject> beforeEnd = map1.subMap(LocalTime.of(0, 0), LocalTime.of(12, 10));
        SortedMap<LocalTime, Subject> afterStart = map2.subMap(LocalTime.of(12, 1), LocalTime.of(23, 59));

        List<Subject> beforeEndSubjects = new ArrayList<>(beforeEnd.values().stream().toList());
        List<Subject> afterStartSubjects = afterStart.values().stream().toList();

        beforeEndSubjects.retainAll(afterStartSubjects);

        if (beforeEndSubjects.isEmpty()) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }
}









