package org.example;

import java.util.Scanner;

public class P03LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(transformLastDigit(number));
    }

    private static String transformLastDigit(int number) {
        String numberAsString = String.valueOf(number);
        int symbolsCount = numberAsString.length();
        char lastChar = numberAsString.toCharArray()[symbolsCount - 1];
        int lastDigit = Integer.parseInt(String.valueOf(lastChar));
        return getLastDigit(lastDigit);
    }

    private static String getLastDigit(int lastDigit) {
        String result = "";
        switch (lastDigit) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            default:
                result = "zero";
                break;
        }
        return result;
    }
}
