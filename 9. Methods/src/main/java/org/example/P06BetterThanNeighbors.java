package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P06BetterThanNeighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt( (element) -> Integer.parseInt(element))
                    .toArray();

        System.out.println(findElement(array));
    }

    private static int findElement(int[] array) {
        if (array.length < 3) {
            throw new IllegalArgumentException("The array's elements should be more than 3.");
        }

        int result = -1;
        for (int i = 1; i < array.length - 1; i++) {
            int currentElement = array[i];
            int previous = array[i - 1];
            int next = array[i + 1];

            if (currentElement > previous + next) {
                result = currentElement;
                break;
            }
        }
        return result;
    }
}
