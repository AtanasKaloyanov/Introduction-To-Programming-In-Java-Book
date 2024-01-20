package org.example;
import java.util.Scanner;

public class P05FibonacciIter {
    private static int fibSum(int number) {
        int sum = 1;
        int previous = 1;
        int previous2 = 0;

        for (int i = 1; i <= number; i++) {
            if (i == previous + previous2) {
                sum += i;
                int pattern = previous;
                previous = i;
                previous2 = pattern;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(fibSum(number));
    }
}
