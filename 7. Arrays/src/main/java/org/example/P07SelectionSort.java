package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P07SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;
            int firstElement = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int currentElement = array[j];
                if (currentElement < firstElement) {
                    smallestIndex = j;
                }
            }

            if (smallestIndex != i) {
                int bestElement = array[smallestIndex];
                array[i] = bestElement;
                array[smallestIndex] = firstElement;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
