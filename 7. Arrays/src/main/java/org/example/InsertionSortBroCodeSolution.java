package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortBroCodeSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt((element) -> Integer.parseInt(element))
                .toArray();

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
