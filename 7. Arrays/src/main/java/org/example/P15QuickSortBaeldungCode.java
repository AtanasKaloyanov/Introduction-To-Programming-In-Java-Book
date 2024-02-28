package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P15QuickSortBaeldungCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt( (element) -> Integer.parseInt(element))
                .toArray();

// 8 2 4 7 1 3 9 6 5
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public  static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            System.out.println(partitionIndex);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int array[], int begin, int end) {
        int pivot = array[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[end]; // pivot
        array[end] = temp;

        return i + 1;
    }
}
