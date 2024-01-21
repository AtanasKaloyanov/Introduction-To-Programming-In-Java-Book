package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P11SmallMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][columns];

        readingMatrix(matrix, rows, columns, scanner);

        int upperLeftElRow = 0;
        int upperLeftElColumn = 0;
        int bestSum = 0;

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (currentSum > bestSum) {
                    upperLeftElRow = i;
                    upperLeftElColumn = j;
                    bestSum = currentSum;
                }
            }
        }

        printingMatrix(matrix, upperLeftElRow, upperLeftElColumn);
    }

    private static void readingMatrix(int[][] matrix, int rows, int columns, Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt((element) -> Integer.parseInt(element))
                    .toArray();
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = numbers[j];
            }
        }
    }

    private static void printingMatrix(int[][] matrix, int rows, int columns) {
        for (int i = rows; i < rows + 3; i++) {
            for (int j = columns; j < columns + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
