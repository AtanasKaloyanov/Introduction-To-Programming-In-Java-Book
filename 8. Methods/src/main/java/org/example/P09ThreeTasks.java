package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P09ThreeTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        System.out.println(reverse(number));

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(arithmeticMean(array));
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(solveEquation(a, b));
    }
    private static double reverse(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number should be positive.");
        }
        String reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();
        return Double.parseDouble(reversedString);
    }
    private static double arithmeticMean(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array has 0 elements.");
        }
        double arraySum = Arrays.stream(array).sum() * 1.0;
        return arraySum / array.length;
    }

    private static double solveEquation(int a, int b) {
        if (a < 0) {
            throw new IllegalArgumentException("The a element should be bigger than 0.");
        }
        return -b * 1.0 / a;
    }
}
