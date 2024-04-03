package org.example.T02Labyrinth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    private static int n;
    private static char[][] labyrinth;
    private static int heroRow;
    private static int heroColumn;
    private static TreeSet<Integer> pathsSteps = new TreeSet<>();
    private static int counter = -1;

    public static void main(String[] args) {
        // 1. Reading the rows (and columns because the matrix is a square),
        //   initialisation and filling of the matrix. By the time of the
        //   filling of the matrix the hero row and the hero column are found
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        labyrinth = new char[n][n];

        fillMatrix(scanner);

        // 2. The hero moves in the labyrinth (by recursion to the left, up, right and down).
        // He can move only on 0 square (the other square is x). When he receives 0 the square
        // turns into '*' because the hero mustn't go back. And the counter increases by one.
        // The hero must go out of the labyrinth (out of the matrix). This happens when:
        // 1. the hero row becomes-1,
        // 2. the hero row becomes equals to n,
        // 3. the hero column becomes -1
        // 4. the hero column becomes equals to n.
        // In these cases a path is found. The counter will be added in the set.
        // At the main method prints the shortest path
        movingInTheLabyrinth(heroRow, heroColumn, counter);

        // 3/ Printing the last path. It is the shortest.
        System.out.println(pathsSteps.last());
    }

    private static void movingInTheLabyrinth(int heroRow, int heroColumn, int counter) {
        counter++;

        if (heroColumn == 0 || heroRow == 0 || heroColumn == n - 1 || heroRow == n - 1) {
            counter++;
            pathsSteps.add(counter);
            return;
        }

        labyrinth[heroRow][heroColumn] = '*';

        if (labyrinth[heroRow][heroColumn - 1] == '0') {
            movingInTheLabyrinth(heroRow, heroColumn - 1, counter);
        }
        if (labyrinth[heroRow - 1][heroColumn] == '0') {
            movingInTheLabyrinth(heroRow - 1, heroColumn, counter);
        }
        if (labyrinth[heroRow][heroColumn + 1] == '0') {
            movingInTheLabyrinth(heroRow, heroColumn + 1, counter);
        }
        if (labyrinth[heroRow + 1][heroColumn] == '0') {
            movingInTheLabyrinth(heroRow + 1, heroColumn, counter);
        }

    }

    private static void fillMatrix(Scanner scanner) {
        for (int i = 0; i < n; i++) {
            char[] positions = scanner.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                char currentPosition = positions[j];
                if (currentPosition == '*') {
                    heroRow = i;
                    heroColumn = j;
                }
                labyrinth[i][j] = currentPosition;
            }
        }
    }
}
