package org.example;

import java.util.Scanner;

public class P02GetMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.max(first, getMax(second, third)));
    }

    private static int getMax(int first, int second) {
        return Math.max(first, second);
    }
}
