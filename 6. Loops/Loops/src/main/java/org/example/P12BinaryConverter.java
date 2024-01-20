package org.example;

import java.util.Scanner;

public class P12BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(binaryConverter(number));
    }

    private static int binaryConverter(int number) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int current = number % 2;
            result.append(current);

            number /= 2;
        }

        result.reverse();
        return Integer.parseInt(result.toString());
    }
}
