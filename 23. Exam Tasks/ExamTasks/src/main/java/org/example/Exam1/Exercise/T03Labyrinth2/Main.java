package org.example.Exercise.T03Labyrinth2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final String INPUT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exercise\\T03Labyrinth2\\Problem.in";
    private static final String OUTPUT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exercise\\T03Labyrinth2\\Problem.out";
    private static char[][] matrix;
    private static int heroRow;
    private static int heroColumn;
    private static Set<String> result = new LinkedHashSet<>();

    public static void main(String[] args) {
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {
            // 1. Reading the input and filling the matrix
            File file = new File(INPUT_PATH);
            scanner = new Scanner(file, StandardCharsets.UTF_8);
            int rowsAndColumns = Integer.parseInt(scanner.nextLine());
            matrix = new char[rowsAndColumns][rowsAndColumns];

            fillingMatrix(scanner, rowsAndColumns);
            StringBuilder words = new StringBuilder();
            // 2. Moving in the matrix
            if (rowsAndColumns > 0) {
                moveInTheMaze(matrix, heroRow, heroColumn, words);
            }

            // 3. Result printing
            System.out.println(result.toString().replaceAll("\\*", ""));

            printWriter = new PrintWriter(OUTPUT_PATH, StandardCharsets.UTF_8);
        } catch (IOException io) {
            System.out.println(io.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (printWriter != null) {
                printWriter.close();

            }
        }
    }

    private static void moveInTheMaze(char[][] matrix, int heroRow, int heroColumn, StringBuilder word) {
        if (heroColumn == -1 || heroRow == -1 || heroColumn == matrix[0].length || heroRow == matrix.length) {
            result.add(word.toString());
            return;
        }

        word.append(matrix[heroRow][heroColumn]);
        matrix[heroRow][heroColumn] = '*';

        if (heroColumn - 1 == -1 || (isLetteR(matrix, heroRow, heroColumn - 1))) {
            moveInTheMaze(matrix, heroRow, heroColumn - 1, word); // left
        }
        if (heroRow - 1 == -1 || (isLetteR(matrix, heroRow - 1, heroColumn))) {
            moveInTheMaze(matrix, heroRow - 1, heroColumn, word); // up
        }
        if (heroColumn + 1 == matrix[0].length || (isLetteR(matrix, heroRow, heroColumn + 1))) {
            moveInTheMaze(matrix, heroRow, heroColumn + 1, word); // right
        }
        if (heroRow + 1 == matrix.length || (isLetteR(matrix, heroRow + 1, heroColumn))) {
            moveInTheMaze(matrix, heroRow + 1, heroColumn, word); // down
        }

        String wordBeforeLeaving = word.toString();
        matrix[heroRow][heroColumn] = wordBeforeLeaving.charAt(wordBeforeLeaving.length() - 1);
        word.delete(word.length() - 1, matrix[heroRow][heroColumn]);
    }

    private static boolean isLetteR(char[][] matrix, int heroRow, int heroColumn) {
        return matrix[heroRow][heroColumn] >= 97 && matrix[heroRow][heroColumn] <= 122;
    }

    private static void fillingMatrix(Scanner scanner, int rowsAndColumn) {
        for (int row = 0; row < rowsAndColumn; row++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            char[] array = line.toCharArray();
            for (int colum = 0; colum < rowsAndColumn; colum++) {
                char currentChar = array[colum];
                matrix[row][colum] = currentChar;

                if (currentChar == '*') {
                    heroRow = row;
                    heroColumn = colum;
                }
            }
        }
    }
}
