package org.example;

import java.util.Scanner;

public class NestedLoops {
    public static int numberOfLoops;
    public static int numberOfIterations;
    public static int[] Loops;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberOfLoops = Integer.parseInt(scanner.nextLine());
        numberOfIterations = Integer.parseInt(scanner.nextLine());
        System.out.printf("N = %d\n", numberOfLoops);
        System.out.printf("K = %d\n", numberOfIterations);
        Loops = new int[numberOfIterations];

        nestedLoops(0);
    }

    private static void nestedLoops(int currentLoop) {
        if (currentLoop == numberOfLoops) {
            printLoops();
            return;
        }

        for (int counter = 1; counter <= numberOfIterations; counter++) {
            Loops[currentLoop] = counter;
            nestedLoops(currentLoop + 1);
        }
    }

    private static void printLoops() {
        for (int i = 0; i < numberOfLoops; i++) {
            System.out.printf("%d ", Loops[i]);
        }
        System.out.println();
    }
}
