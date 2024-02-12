package org.example;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String... args) {
        List<Integer> first = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> second = new ArrayList<>(List.of(3, 4, 5, 6));

        List<Integer> intersection = new ArrayList<>(first);
        intersection.retainAll(second);
        System.out.println(intersection);
    }
}
