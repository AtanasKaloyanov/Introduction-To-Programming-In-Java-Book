package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt((element) -> Integer.parseInt(element))
                .toArray();

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int previousElement = array[i - 1];
            int j = i;
            while (currentElement < previousElement) {

                array[j - 1] = currentElement;
                array[j] = previousElement;

                j--;
                if (j - 1 < 0) {
                    break;
                }

                currentElement = array[j];
                previousElement = array[j - 1];
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
