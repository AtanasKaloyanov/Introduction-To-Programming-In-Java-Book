package org.SoftUni;

import java.util.Scanner;

public class P01OddOrNot {
    private static boolean oddOrEven(int number) {
       return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giverNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(oddOrEven(giverNumber));
    }
}