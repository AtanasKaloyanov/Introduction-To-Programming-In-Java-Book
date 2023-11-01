package org.example.Task1;

import java.util.*;

public class Subsets {
    // input
    // [ sea beer money pleasure ]

    // output
    // [],

    //  0       1        2         3
    // [sea], [beer], [money], [pleasure],

    //  0     1       0     2       0      3              1      2       1       3                2       3
    // [sea, beer], [sea, money], [sea, pleasure], (->) [beer, money], [beer, pleasure], (->)  [money, pleasure]

    //  0     1      2       0    1       3         0     2       3         1      2       3
    // [sea, beer, money], [sea, beer, pleasure], [sea, money, pleasure], [beer, money, pleasure]

    //  0     1     2       3
    // [sea, beer, money, pleasure]

    private static String[] words =
            {"sea", "beer", "money", "pleasure"};

    public static void main(String[] args) {
        Queue<List<Integer>> queue = new ArrayDeque<>();
        List<Integer> emptyList = new ArrayList<>();
        queue.add(emptyList);

        while (!queue.isEmpty()) {
            List<Integer> current = queue.poll();
            printCurrentElement(current);

            int startIndex = -1;
            if (!current.isEmpty()) {
                startIndex = current.get(current.size() - 1);
            }

            for (int i = startIndex + 1; i < words.length; i++) {
                List<Integer> newList = new ArrayList<>();
                newList.addAll(current);
                newList.add(i);
                queue.add(newList);
            }
        }
    }

    private static void printCurrentElement(List<Integer> current) {
        for (int i = 0; i < current.size(); i++) {
            int currentIndex = current.get(i);
            System.out.print(words[currentIndex] + " ");
        }
        System.out.println();
    }
}



