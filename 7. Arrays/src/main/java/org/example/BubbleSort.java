package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt((element) -> Integer.parseInt(element))
                .toArray();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                int currentElement = array[j];
                int nextElement = array[j + 1];
                if (currentElement > nextElement) {
                    array[j] = nextElement;
                    array[j + 1] = currentElement;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
