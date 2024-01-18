package org.SoftUni;

import java.util.Scanner;

public class P10AritmethicOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(sum(number));
        System.out.println(oppositeNumber(number));
        System.out.println(lastDigBecFirst(number));
        System.out.println(secondThirdDigitChange(number));
    }

    public static int secondThirdDigitChange(int number) {
        char[] array = charArrayConverter(number);
        char second = array[1];
        char third = array[2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                sb.append(third);
            } else if (i == 2) {
                sb.append(second);
            } else {
                sb.append(array[i]);
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static int lastDigBecFirst(int number) {
        char[] array = charArrayConverter(number);
        char lastChar = array[array.length - 1];
        StringBuilder sb = new StringBuilder();
        sb.append(lastChar);

        for (int i = 0; i < array.length - 1; i++) {
            sb.append(array[i]);
        }

        return Integer.parseInt(sb.toString());
    }

    public static String oppositeNumber(int number) {
        char[] array = charArrayConverter(number);
        StringBuilder result = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            int current = Integer.parseInt(String.valueOf(array[i]));
            result.append(current);
        }
        return result.toString();
    }

    public static int sum(int number) {
        char[] array = charArrayConverter(number);
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            char current = array[i];
            int currentNumber = Integer.parseInt(String.valueOf(current));
            sum += currentNumber;
        }
        return sum;
    }

    private static char[] charArrayConverter(int number) {
        return String.valueOf(number).toCharArray();
    }
}
