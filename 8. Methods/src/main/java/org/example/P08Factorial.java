package org.example;

import java.util.Scanner;

public class P08Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(factorial(number));
    }

    private static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number should be positive.");
        }

        long fact = 1;
        for (int i = number; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

}
