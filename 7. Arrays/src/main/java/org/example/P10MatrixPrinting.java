package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P10MatrixPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][columns];
        readingMatrix(matrix, rows, columns, scanner);
        printingMatrix(matrix);
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
    private static void printingMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
