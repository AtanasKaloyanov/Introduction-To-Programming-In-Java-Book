package org.example;

import java.util.Scanner;

public class P14HexConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(hexConverter(number));
    }

    private static String hexConverter(int number) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % 16;
            remainderAddition(result, remainder);
            number /= 16;
        }

        result.reverse();
        return result.toString();
    }

    private static void remainderAddition(StringBuilder result, int remainder) {
        if (remainder <= 9) {
            result.append(remainder);
        } else if (remainder == 10) {
            result.append("A");
        } else if (remainder == 11) {
            result.append("B");
        } else if (remainder == 12) {
            result.append("C");
        } else if (remainder == 13) {
            result.append("D");
        } else if (remainder == 14) {
            result.append("E");
        } else if (remainder == 15) {
            result.append("F");
        }
    }
}
