package org.example.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P02VariationWithRepeatingIterative {
    private static int n;
    private static int k;
    private static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = Integer.parseInt(scanner.nextLine());
        k = Integer.parseInt(scanner.nextLine());
        array = new int[n];

        variationsWithoutRepeating();
    }

    private static void variationsWithoutRepeating() {
        for (int i = 0; i < n; i++) {
            array[i] = 1;
        }

        int currentPosition;

        while (true) {
            printing();
            currentPosition = n - 1;
            array[currentPosition] = array[currentPosition] + 1;

            while (array[currentPosition] > k) {
                array[currentPosition] = 1;
                currentPosition--;

                if (currentPosition < 0) {
                    return;
                }

                array[currentPosition] = array[currentPosition] + 1;
            }

        }
    }

    // 1 1
    // 1 2
    // 1 3

    private static void printing() {
        System.out.println(Arrays.toString(array).replaceAll(",", ""));
    }
}
