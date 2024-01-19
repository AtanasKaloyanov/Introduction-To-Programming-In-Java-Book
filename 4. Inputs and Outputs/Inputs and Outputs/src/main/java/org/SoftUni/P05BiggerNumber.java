package org.SoftUni;

import java.util.Scanner;

public class P05BiggerNumber {
    private static int biggerNumber(int first, int second) {
        return Math.max(first, second);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println(biggerNumber(first, second));
    }
}
