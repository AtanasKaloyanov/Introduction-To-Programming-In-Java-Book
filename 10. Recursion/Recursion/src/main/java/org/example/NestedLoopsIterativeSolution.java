package org.example;
import java.util.Scanner;

public class NestedLoopsIterativeSolution {
   private static int n;
   private static int k;
   private static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        k = Integer.parseInt(scanner.nextLine());
        array = new int[n];

        nestedLoopsIterativeSolution();
    }
    private static void nestedLoopsIterativeSolution() {
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
    private static void printing() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
}
