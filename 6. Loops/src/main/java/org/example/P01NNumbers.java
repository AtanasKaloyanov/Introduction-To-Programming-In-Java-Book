package org.example;

import java.util.Scanner;

public class P01NNumbers {
    private static void numbersTo(int number) {
         for (int i = 1; i <= number; i++) {
             System.out.println(i);
         }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = Integer.parseInt(scanner.nextLine());
        numbersTo(givenNumber);
    }
}
