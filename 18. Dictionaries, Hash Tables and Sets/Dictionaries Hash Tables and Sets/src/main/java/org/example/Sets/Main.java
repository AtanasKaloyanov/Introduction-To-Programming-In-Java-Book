package org.example.Sets;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Set.of(2, 4, 6, 10));
        set1.retainAll(set2);
        System.out.println(set1);

        Set<Integer> set3 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set4 = new HashSet<>(Set.of(4, 5));
        set3.addAll(set4);
        System.out.println(set3);

        Set<Integer> set5 = new HashSet<>(Set.of(1, 2, 3, 4));
        Set<Integer> set6 = new HashSet<>(Set.of(2, 3, 5));
        boolean isInTheCollection = set5.containsAll(set6);
        System.out.println(isInTheCollection);



    }
}
