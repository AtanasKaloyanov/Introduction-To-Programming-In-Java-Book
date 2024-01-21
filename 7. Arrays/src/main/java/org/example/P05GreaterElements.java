package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P05GreaterElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstElement = array[0];
        List<Integer> maxElements = new ArrayList<>(List.of(firstElement));
        List<Integer> currentElements = new ArrayList<>(List.of(firstElement));

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            if (currentElement > currentElements.get(currentElements.size() - 1)) {
                currentElements.add(currentElement);
                if (currentElements.size() > maxElements.size()) {
                    maxElements = currentElements;
                }
            } else {
                currentElements = new ArrayList<>();
                currentElements.add(currentElement);
            }
        }

        for (int current : maxElements) {
            System.out.print(current + " ");
        }
    }

}
