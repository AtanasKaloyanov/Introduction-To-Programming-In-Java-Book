package org.example;
import java.util.Scanner;

public class P08SFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println(sum(number, x));
    }
    private static double sum(int number, int x) {
        double sum = 1;
        for (int i = 1; i <= number; i++) {
             double devisor = factComp(i);
             double devident = Math.pow(x, i);
             double quotient = devisor / devident;
             sum += quotient;
        }

        return sum;
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
