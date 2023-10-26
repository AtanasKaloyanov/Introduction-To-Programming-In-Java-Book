package Graph;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int firstDimension = 3;
         int secondDimension = 5;

        int[][] matrix = new int[firstDimension][secondDimension];

        for (int i = 0; i < firstDimension; i++) {
            Arrays.fill(matrix[i], 1);
        }

        for (int i = 0; i < firstDimension; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
