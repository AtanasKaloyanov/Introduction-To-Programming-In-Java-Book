package org.SoftUni;

import java.util.Scanner;

public class P06SumNumbers {
    private static int sum(int first, int second, int third, int fourth, int fifth) {
        return first + second + third + fourth + fifth;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());
        int fifth = Integer.parseInt(scanner.nextLine());

        System.out.println(sum(first, second, third, fourth, fifth));
    }
}
