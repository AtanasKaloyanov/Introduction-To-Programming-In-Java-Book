package org.example;

import java.util.Scanner;

public class P15FromHexToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexNumber = scanner.nextLine();
        System.out.println(decVonverter(hexNumber));
    }
    private static int decVonverter(String hexNumber) {
        String hexNumberReverse = new StringBuilder(hexNumber).reverse().toString();
        char[] array = hexNumberReverse.toCharArray();
        return addToTheSum(array);
    }
    private static int addToTheSum(char[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            char currentElement = array[i];

            if (Character.isDigit(currentElement)) {
                int number = Integer.parseInt(String.valueOf(currentElement));
                sum += (int) (number * (Math.pow(16, i)));
            } else if (currentElement == 'A') {
                sum += (int) (10 * (Math.pow(16, i)));
            } else if (currentElement == 'B') {
                sum += (int) (11 * (Math.pow(16, i)));
            } else if (currentElement == 'C') {
                sum += (int) (12 * (Math.pow(16, i)));
            } else if (currentElement == 'D') {
                sum += (int) (13 * (Math.pow(16, i)));
            } else if (currentElement == 'E') {
                sum += (int) (14 * (Math.pow(16, i)));
            } else if (currentElement == 'F') {
                sum += (int) (15 * (Math.pow(16, i)));
            }
        }
        return sum;
    }

}
