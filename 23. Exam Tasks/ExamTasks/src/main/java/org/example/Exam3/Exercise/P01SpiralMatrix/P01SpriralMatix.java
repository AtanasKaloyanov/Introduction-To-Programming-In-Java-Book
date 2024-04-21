package org.example.Exam3.Exercise.P01SpiralMatrix;

import java.util.Scanner;

import static org.example.Exam3.T01Matrix.Main.*;

public class P01SpriralMatix {
    private static int[][] matrix;
    private static int movingRow = 0;
    private static int movingColumn;
    private static int number = 1;

    public static void main(String[] args) {
        // 1. Reading of the input and initialisation of the matrix and the moving column
        Scanner scanner = new Scanner(System.in);
        int dimensions = Integer.parseInt(scanner.nextLine());
        matrix = new int[dimensions][dimensions];
        movingColumn = dimensions - 1;
        matrix[movingRow][movingColumn] = number++;

        // 2. Filling the matrix
        int limit = dimensions * dimensions;

        while (true) {
            movingDown();
            if (number - 1 == limit) {
                break;
            }
            movingLeft();
            movingUp();
            if (number - 1 == limit) {
                break;
            }
            movingRight();
        }

        // 3. Result Printing
        resultPrinting(dimensions);
    }
    private static void movingRight() {
        while (true) {
            matrix[movingRow][++movingColumn] = number++;
            if (matrix[movingRow][movingColumn + 1] == matrix.length || matrix[movingRow][movingColumn + 1] != 0) {
                return;
            }
        }
    }
    private static void movingUp() {
        while (true) {
            matrix[--movingRow][movingColumn] = number++;
            if (movingRow - 1 == -1 || matrix[movingRow - 1][movingColumn] != 0) {
                return;
            }
        }
    }
    private static void movingLeft() {
        while (true) {
            matrix[movingRow][--movingColumn] = number++;
            if (movingColumn - 1 == -1 || matrix[movingRow][movingColumn - 1] != 0) {
                return;
            }
        }
    }
    private static void movingDown() {
        while (true) {
            matrix[++movingRow][movingColumn] = number++;
            if (movingRow + 1 == matrix.length || matrix[movingRow + 1][movingColumn] != 0) {
                return;
            }
        }
    }
    private static void resultPrinting(int dimensions) {
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
