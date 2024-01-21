package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P02EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = arrayReader(scanner);
        int[] array2 = arrayReader(scanner);

        System.out.println(areEqual(array1, array2));
    }

    private static boolean areEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    private static int[] arrayReader(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
