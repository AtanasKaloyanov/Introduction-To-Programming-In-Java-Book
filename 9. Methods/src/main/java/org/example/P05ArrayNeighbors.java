package org.example;

import java.util.Scanner;

public class P05ArrayNeighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = Integer.parseInt(scanner.nextLine());
        int[] array = {1, 2, 8, 5};
        System.out.println(neighborsCompare(array, index));
    }

    private static boolean neighborsCompare(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Invalid index.");
        }

        boolean result;
        int element = array[index];

        if (index == 0) {
            int rightNeighbor = array[1];
            result = element > rightNeighbor;
        } else if (index == array.length - 1) {
            int leftNeighbor = array[index - 1];
            result = element > leftNeighbor;
        } else {
            int leftNeighbor = array[index - 1];
            int rightNeighbor = array[index + 1];
            result = element > leftNeighbor + rightNeighbor;
        }
        return result;
    }
}
