package org.example.T02Labyrinth;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static final String INPUT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\T02Labyrinth\\input.txt";
    private static char[][] maze;
    private static Position heroPosition;

    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            // 1. Reading the input and initializing the maze
            scanner = new Scanner(new File(INPUT_PATH));
            int rowsAndColumn = Integer.parseInt(scanner.nextLine());
            maze = new char[rowsAndColumn][rowsAndColumn];
            fillingTheMaze(scanner, rowsAndColumn);

            // 2. Moving in the maze and finding the shortest way out
            Queue<Position> positions = new ArrayDeque<>();
            positions.add(heroPosition);

            while (!positions.isEmpty()) {
                Position currentPosition = positions.remove();
                int currentRow = currentPosition.getRow();
                int currentColumn = currentPosition.getColumn();
                int currentDistance = currentPosition.getDistance();
                if (currentColumn == 0 ||
                        currentRow == 0 ||
                        currentColumn == rowsAndColumn - 1 ||
                        currentRow == rowsAndColumn - 1) {
                    System.out.println(currentDistance + 1);
                    return;
                }

                movingInTheMaze(currentRow, currentColumn - 1, currentDistance, positions);
                movingInTheMaze(currentRow - 1, currentColumn, currentDistance, positions);
                movingInTheMaze(currentRow, currentColumn + 1, currentDistance, positions);
                movingInTheMaze(currentRow + 1, currentColumn, currentDistance, positions);
            }
            System.out.println("The maze hasn't way out.");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void movingInTheMaze(int currentRow, int currentColumn, int currentDistance, Queue<Position> positions) {
        if (maze[currentRow][currentColumn] == '0') {
            maze[currentRow][currentColumn] = '*';
            Position left = new Position(currentRow, currentColumn, currentDistance + 1);
            positions.add(left);
        }
    }

    private static void fillingTheMaze(Scanner scanner, int rowsAndColumn) {
        for (int row = 0; row < rowsAndColumn; row++) {
            String currentRow = scanner.nextLine();
            char[] rowCharArray = currentRow.toCharArray();
            for (int column = 0; column < rowsAndColumn; column++) {
                char currentChar = rowCharArray[column];
                if (currentChar == '*') {
                    heroPosition = new Position(row, column, 0);
                }
                maze[row][column] = currentChar;
            }
        }
    }
}
