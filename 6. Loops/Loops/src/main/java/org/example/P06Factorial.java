package org.example;

import java.util.Scanner;

public class P06Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println(factDev(number1, number2));
    }

    private static int  factDev(int number1, int number2) {
        int firstNumberFact = factComp(number1);
        System.out.println(firstNumberFact);
        int secondFact = factComp(number2);
        System.out.println(secondFact);
        return firstNumberFact  / secondFact;
    }

    private static int factComp(int number) {
        if (number == 0) {
            return 1;
        }
        int result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
