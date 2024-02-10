package org.example.a;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class P03SubMatrix {
    private static final String PATH_FROM = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P03\\from.txt";
    private static final String PATH_TO = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P03\\to.txt";

    public static void main(String[] args) {
        Scanner scanner = null;
        PrintStream ps = null;
        try {
           File from = new File(PATH_FROM);
           scanner = new Scanner(from, StandardCharsets.UTF_8);
           int [][] matrix = readMatrix(scanner);

           int bestLeftUpRow = 0;
           int bestLeftUpCol = 0;
            int bestSum = Integer.MIN_VALUE;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    int currentElement = matrix[i][j];
                    int currentSum = currentElement + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                    if (currentSum > bestSum) {
                        bestLeftUpRow = i;
                        bestLeftUpCol = j;
                        bestSum = currentSum;
                    }
                }
            }

            File to = new File(PATH_TO);
            ps = new PrintStream(to, StandardCharsets.UTF_8);
            write(matrix, bestLeftUpRow, bestLeftUpCol, ps);

        }  catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }

    private static void write(int[][] matrix, int bestLeftUpRow, int bestLeftUpCol, PrintStream ps) throws IOException {
        String firstLine = matrix[bestLeftUpRow][bestLeftUpCol] + " " + matrix[bestLeftUpRow][bestLeftUpCol + 1];
        String secondLine = matrix[bestLeftUpRow + 1][bestLeftUpCol] + " " + matrix[bestLeftUpRow + 1][bestLeftUpCol + 1];
        ps.println(firstLine);
        ps.println(secondLine);
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[][] matrix = new int[6][6];
        while (scanner.hasNextLine()) {
            for (int i = 0; i < 6; i++) {
                int[] currentLine = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                for (int j = 0; j < 6; j++) {
                    matrix[i][j] = currentLine[j];
                }
            }

        }
        return matrix;
    }
}
