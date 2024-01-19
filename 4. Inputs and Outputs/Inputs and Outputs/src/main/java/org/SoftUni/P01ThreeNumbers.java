package org.SoftUni;

import java.util.Scanner;

public class P01ThreeNumbers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int sum(int first, int second, int third) {
        return first + second + third;
    }

    public static void main(String[] args) {
        int first = Integer.parseInt(SCANNER.nextLine());
        int second = Integer.parseInt(SCANNER.nextLine());
        int third = Integer.parseInt(SCANNER.nextLine());

        System.out.println(sum(first, second, third));
    }
}
