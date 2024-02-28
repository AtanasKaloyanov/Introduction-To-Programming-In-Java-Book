package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P15QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt((element) -> Integer.parseInt(element))
                .toArray();

        int startIndex = 0;
        int finalIndex = array.length - 1;
        quickSort(array, startIndex, finalIndex);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int startIndex, int finalIndex) {
        if (startIndex >= finalIndex) {
           return;
        }

        int pivot = divideAndConquer(array, startIndex, finalIndex);
        quickSort(array, startIndex, pivot - 1);
        quickSort(array, pivot + 1, finalIndex);
    }

    private static int divideAndConquer(int[] array, int startIndex, int finalIndex) {
        int pivot = array[finalIndex];
        int i = startIndex - 1;

        for (int j = startIndex; j < finalIndex; j++) {
            int currentElement = array[j];
            if (currentElement < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        int temp = array[i];
        array[i] = pivot;
        array[finalIndex] = temp;
        
        return i;
    }
}
