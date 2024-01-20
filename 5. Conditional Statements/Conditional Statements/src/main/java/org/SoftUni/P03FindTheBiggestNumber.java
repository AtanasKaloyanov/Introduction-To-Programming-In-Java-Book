package org.SoftUni;

import java.util.Scanner;

public class P03FindTheBiggestNumber {
    private static int biggestNumber(int first, int second, int third) {
        int result = 0;
        if (first > second) {
            result = Math.max(first, third);
        } else {
            result = Math.max(second, third);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(biggestNumber(first, second, third));
    }
}
