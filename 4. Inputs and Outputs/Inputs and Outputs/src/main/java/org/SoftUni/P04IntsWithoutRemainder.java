package org.SoftUni;

import java.util.Scanner;

public class P04IntsWithoutRemainder {
    private static int numbers(int first, int second) {
        int bigger = Math.max(first, second);
        int smaller = Math.min(first, second);
        int result = 0;

        for (int i = smaller + 1; i < bigger; i++) {
            if (i % 5 != 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println(numbers(first, second));
    }
}
