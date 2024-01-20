package org.example;

import java.util.Scanner;

public class P11TheLastZerosOfFact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(lastZeros(number));
    }

    private static int lastZeros(int number) {
        long fact = factComp(number);
        String numberAsString = String.valueOf(fact);
        char[] array = numberAsString.toCharArray();

        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != '0') {
                break;
            }
            counter++;
        }
        return counter;
    }

    private static long factComp(int number) {
        if (number == 0) {
            return 1;
        }
        long result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
