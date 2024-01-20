package org.example;

import java.util.Scanner;

public class P09CatalansNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(catalansNumbers(number));
    }
    private static double catalansNumbers(int n) {
        double devisor = factComp(2 * n);
        double devident = (factComp(n + 1)) * (factComp(n));
        return devisor / devident;
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
