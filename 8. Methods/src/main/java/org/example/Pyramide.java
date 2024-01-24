package org.example;


import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        halfPrinting(1, number);
        halfPrinting2(1, number);
    }

    private static void halfPrinting(int start, int end) {
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void halfPrinting2(int start, int end) {
        for (int i = end - 1; i >= 1; i--) {
            for (int j = start; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }


}
