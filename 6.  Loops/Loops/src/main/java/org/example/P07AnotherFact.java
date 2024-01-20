package org.example;
import java.util.Scanner;

public class P07AnotherFact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println(formula(number1, number2));
    }
    private static int formula(int k, int n) {
        int firstFact = factComp(k);
        int secondFact = factComp(n);
        int subtrac = factComp(n - k);
        return (firstFact * secondFact) / subtrac;
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
