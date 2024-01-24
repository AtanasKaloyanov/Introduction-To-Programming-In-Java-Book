package org.example;

import java.util.Scanner;

public class P07ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        reversePrinter(number);
    }

    private static void reversePrinter(int number) {
        String result =  new StringBuilder(String.valueOf(number)).reverse().toString();
        System.out.println(result);
    }
}
