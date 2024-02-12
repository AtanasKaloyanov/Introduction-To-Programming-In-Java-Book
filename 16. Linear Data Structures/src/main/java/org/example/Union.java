package org.example;

import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> second = new ArrayList<>(List.of(3, 4, 5, 6));

        List<Integer> union = new ArrayList<>(first);
        union.removeAll(second);
        union.addAll(second);
        System.out.println(union);
    }
}
