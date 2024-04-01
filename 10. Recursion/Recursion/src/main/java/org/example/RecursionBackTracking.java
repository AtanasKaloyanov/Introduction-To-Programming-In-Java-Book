package org.example;

public class RecursionBackTracking {
    private final static char[][] matrix = {
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {'*', '*', ' ', '*', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', 'e'}
    };

//    private static char[][] matrix = {
//            {' ', ' ', ' '},
//            {' ', ' ', ' '},
//            {' ', ' ', 'e'},
//    };
    private static StringBuilder pathDescription = new StringBuilder();

    public static void main(String[] args) {
        moveInTheLabirinth(0, 0, 'R');
    }

    private static void moveInTheLabirinth(int row, int column, char direction) {
        if (column < 0 || row < 0 || column == matrix[0].length || row == matrix.length) {
            return;
        }

        pathDescription.append(direction);

        if (matrix[row][column] == 'e') {
            printPath(pathDescription);
        }

        if (matrix[row][column] == ' ') {
            matrix[row][column] = 's';

            moveInTheLabirinth(row, column - 1, 'L'); // left
            moveInTheLabirinth(row - 1, column, 'U'); // up
            moveInTheLabirinth(row, column + 1, 'R'); // right
            moveInTheLabirinth(row + 1, column, 'D'); // down

            matrix[row][column] = ' ';
        }

        pathDescription.deleteCharAt(pathDescription.length() - 1);
    }

    private static void printPath(StringBuilder pathDescription) {
        if (pathDescription.toString().equals("R")) {
            System.out.println("The labyrinth is empty.");
        }

        System.out.println(pathDescription.toString().substring(1));
    }

}
