package org.example;

import java.util.Scanner;

public class P13BinaryReverseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(converter(number));
    }
    private static int converter(long number) {
        int result = 0;
        char[] array = String.valueOf(number).toCharArray();

        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            char currentChar = array[i];
            int currentNumber = Integer.parseInt(String.valueOf(currentChar));
            double currentSum = currentNumber * Math.pow(2, counter);
            result += currentSum;
            counter++;
        }

        return result;
    }
}
