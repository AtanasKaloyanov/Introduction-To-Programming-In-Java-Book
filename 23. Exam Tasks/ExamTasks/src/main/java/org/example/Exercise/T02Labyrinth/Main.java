package org.example.Exercise.T02Labyrinth;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    private static final String INPUT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exercise\\T02Labyrinth\\Problem.in";
    private static final String OUTPUT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exercise\\T02Labyrinth\\Problem.out";
    private static int heroRow;
    private static int heroColumn;
    private static char[][] matrix;

    private static int waysOut;

    public static void main(String[] args) {

        Scanner scanner = null;
        PrintWriter printWriter = null;

        try {
            // 1. Initialising and filling the matrix
            File input = new File(INPUT_PATH);
            scanner = new Scanner(input, StandardCharsets.UTF_8);
            int matrixRowAndColumn = Integer.parseInt(scanner.nextLine());
            matrix = new char[matrixRowAndColumn][matrixRowAndColumn];

            fillingMatrix(scanner, matrixRowAndColumn);

            // 2. Moving in the matrix
            if (matrixRowAndColumn > 0) {
                moveInTheMaze(matrix, heroRow, heroColumn);
            }

            // 3. printing the result
            printWriter = new PrintWriter(OUTPUT_PATH, StandardCharsets.UTF_8);
            printWriter.println(waysOut);

        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (printWriter != null) {
                printWriter.close();

            }
        }

    }

    private static void moveInTheMaze(char[][] matrix, int heroRow, int heroColumn) {
        if (heroColumn == -1 || heroRow == -1 ||
                heroColumn == matrix[0].length || heroRow == matrix.length) {
            waysOut++;
            return;
        }

        matrix[heroRow][heroColumn] = '*';
        if (heroColumn - 1 == -1 || matrix[heroRow][heroColumn - 1] == '0') {
            moveInTheMaze(matrix, heroRow, heroColumn - 1); // left
        }

        if (heroRow - 1 == -1 || matrix[heroRow - 1][heroColumn] == '0') {
            moveInTheMaze(matrix, heroRow - 1, heroColumn); // up
        }
        if (heroColumn + 1 == matrix[0].length || matrix[heroRow][heroColumn + 1] == '0') {
            moveInTheMaze(matrix, heroRow, heroColumn + 1); // right
        }
        if (heroRow + 1 == matrix.length || matrix[heroRow + 1][heroColumn] == '0') {
            moveInTheMaze(matrix, heroRow + 1, heroColumn); // down
        }

        matrix[heroRow][heroColumn] = '0';
    }

    private static void fillingMatrix(Scanner scanner, int matrixRowAndColumn) {
        for (int row = 0; row < matrixRowAndColumn; row++) {
            char[] line = scanner.nextLine().toCharArray();
            for (int column = 0; column < line.length; column++) {
                char currentChar = line[column];
                matrix[row][column] = currentChar;
                if (currentChar == '*') {
                    heroRow = row;
                    heroColumn = column;
                }
            }
        }
    }
}
