package org.SoftUni;

import java.util.Scanner;

public class P13PrimeNumber {
    private static boolean isOdd(int number) {
        boolean isOdd = false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                isOdd = true;
                System.out.println(i);
                break;
            }
        }
        return isOdd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(isOdd(number));
    }
}
