package org.example;

import java.util.Arrays;

public class BestMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 4, 0, 9, 5},
                {7, 1, 3, 3, 2, 1},
                {10, 10, 9, 8, 9, 9},
                {10, 10, 7, 9, 10, 10}
        };

        int[] bestUpperLeftElement = bestUpperLeftElement(matrix);
        int bestUpperLeftRow = bestUpperLeftElement[0];
        int bestUpperLeftColumn = bestUpperLeftElement[1];

        System.out.println(matrix[bestUpperLeftRow][bestUpperLeftColumn] + " " + matrix[bestUpperLeftRow][bestUpperLeftColumn + 1]);
        System.out.println(matrix[bestUpperLeftRow + 1][bestUpperLeftColumn] + " " + matrix[bestUpperLeftRow + 1][bestUpperLeftColumn + 1]);

        // 00 01   01 02  ...    04 05
        // 10 11   11 12  ...    14 15

        //  ...   24 25
        //  ...   34 34
    }

    private static int[] bestUpperLeftElement(int[][] matrix) {
        int bestRow = -1;
        int bestColumn = -1;
        int bestSum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int currentSum = findSum(matrix, i, j);
                if (currentSum > bestSum) {
                    bestRow = i;
                    bestColumn = j;
                    bestSum = currentSum;
                }
            }
        }
        int[] result = new int[2];
        result[0] = bestRow;
        result[1] = bestColumn;
        return result;
    }

    private static int findSum(int[][] matrix, int row, int column) {
        return matrix[row][column] + matrix[row][column + 1]
                + matrix[row + 1][column] + matrix[row + 1][column + 1];
    }
}
