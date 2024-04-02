package org.example.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P02VariationsWithRepeatingRecursive {
    private static int k;
    private static int n;
    private static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        k = Integer.parseInt(scanner.nextLine());
        n = Integer.parseInt(scanner.nextLine());

        array = new int[k];

        variationsRec(0);
    }
    private static void variationsRec(int index) {
        if (index == k) {
            printing();
            return;
        }

        for (int i = 1; i <= n; i++) {
            array[index] = i;
            variationsRec(index + 1);
        }
    }
    private static void printing() {
        System.out.println(Arrays.toString(array));
    }
}
