package org.example.Task1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetsExercise {
    private static String[] input = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextLine().split(" ");
        // 0 1 2 3 4
        // a b c d e

        /*

        a - 0
        b - 1
        c - 2
        d - 3
        e - 4
        a b - 0 1
        a c - 0 2
        a d - 0 3
        a e - 0 4
        b c - 1 2
        b d - 1 3
        b e - 1 4
        c d - 2 3
        c e - 2 4
        d e - 3 4
        a b c - 0 1 2
        a b d - 0 1 3
        a b e - 0 1 4
        a c d - 0 2 3
        a c e - 0 2 4
        a d e - 0 3 4
        b c d - 1 2 3
        b c e - 1 2 4

         */

        ArrayDeque<List<Integer>> queue = new ArrayDeque<>();
        List<Integer> emptyList = new ArrayList<>();
        queue.add(emptyList);

        while (!queue.isEmpty()) {
            List<Integer> currentList = queue.poll();
            printCurrentElements(currentList);

            int startIndex = -1;
            if (!currentList.isEmpty()) {
                startIndex = currentList.get(currentList.size() - 1);
            }

            for (int i = startIndex + 1; i < input.length; i++) {
                List<Integer> newList = new ArrayList<>();
                newList.addAll(currentList);
                newList.add(i);
                queue.add(newList);
            }
        }
    }

    private static void printCurrentElements(List<Integer> currentList) {
        for (int i = 0; i < currentList.size(); i++) {
            int currentIndex = currentList.get(i);
            System.out.print(input[currentIndex] + " ");
        }
        System.out.println();
    }
}
