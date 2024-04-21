package org.example.Exam3.T01Matrix;

import java.util.Scanner;

public class Main {
    private static int[][] matrix;
    private static int movingRow;
    private static int movingColumn;
    private static int number = 1;
    private static boolean flag = true;

    public static void main(String[] args) {
        // 1. Reading the input (dimensions) and initialising the matrix
        Scanner scanner = new Scanner(System.in);
        int dimensions = Integer.parseInt(scanner.nextLine());
        matrix = new int[dimensions][dimensions];

        // 2. Filling the matrix only with -1
        fillingTheMatrixWithMinusOne(dimensions);

        // 3. Finding the beginning
        findingTheBeginning(dimensions);

        // 4. Moving in the matrix
        int lastNumber = dimensions * dimensions - 1;
        while (true) {
            movingDown();
            if (number == lastNumber + 1) {
                break;
            }
            movingLeft();
            movingUp();
            if (number == lastNumber + 1) {
                break;
            }
            movingRight();
        }

        //  5. Result Printing
        resultPrinting(dimensions);

    }

    private static void movingRight() {
        while (true) {
            matrix[movingRow][++movingColumn] = number++;
            if (matrix[movingRow + 1][movingColumn] == -1) {
                return;
            }
        }
    }
    private static void movingUp() {
        while (true) {
            matrix[--movingRow][movingColumn] = number++;
            if (movingRow - 1 == -1 || matrix[movingRow][movingColumn + 1] == -1) {
                return;
            }
        }
    }
    private static void movingLeft() {
        while (true) {
            matrix[movingRow][--movingColumn] = number++;
            if (matrix[movingRow - 1][movingColumn] == -1) {
                return;
            }
        }
    }
    private static void movingDown() {
        while (true) {
            matrix[++movingRow][movingColumn] = number++;
            if (movingRow + 1 == matrix.length || matrix[movingRow][movingColumn - 1] == -1) {
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
    private static void fillingTheMatrixWithMinusOne(int dimensions) {
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                matrix[i][j] = -1;
            }
        }
    }
    private static void findingTheBeginning(int dimensions) {
        if (dimensions % 2 != 0) {
            movingRow = dimensions / 2;
            movingColumn = dimensions / 2;
        } else {
            movingRow = dimensions / 2 - 1;
            movingColumn = dimensions / 2;
        }

        matrix[movingRow][movingColumn] = 0;
    }
}

/*

    1. input - 3

       00 01 02      4 5 6
       10 11 12      3 0 7
       20 21 22      2 1 8

   The center is 11
   Moving:
     down - 1        down - 2
     left - 1
     up - 2
     right - 2


      2. input - 4

       00 01 02 03     15   4   5   6
       10 11 12 13     14   3   0   7
       20 21 22 23     13   2   1   8
       30 31 32 33     12  11  10   9

       The center is 12
       Moving:

       down - 1          down - 3
       left - 1          left - 3
       up -   2          up - 3
       right - 2

       3. input - 5

       00 01 02 03 04             16  17  18  19  20
       10 11 12 13 14             15   4   5   6  21
       20 21 22 23 24             14   3   0   7  22
       30 31 32 33 34             13   2   1   8  23
       40 41 42 43 44             12  11  10   9  24

       down - 1          down - 3       down - 4
       left - 1          left - 3
       up -   2          up - 4
       right - 2         right - 4


       The center is: 22
*/
