package org.example;

import java.util.*;

public class P04EqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int previousElement = array[0];
        int currentCount = 1;

        int maxElement = array[0];
        int maxCount = 1;

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            if (currentElement == previousElement) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxElement = currentElement;
                }
            } else {
                currentCount = 1;
                previousElement = currentElement;
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(maxElement + " ");
        }
    }
}
