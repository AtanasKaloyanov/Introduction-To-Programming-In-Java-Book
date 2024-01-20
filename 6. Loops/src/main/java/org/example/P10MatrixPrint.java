package org.example;

import java.util.Scanner;

public class P10MatrixPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        matrixPrint(number);
    }
    private static void matrixPrint(int number) {
        int counter = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = counter; j < counter + number; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            counter++;
        }
    }
}
