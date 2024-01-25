package org.example;

import java.util.Scanner;

public class P02TriangleHypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(hypotenuse(2, 4));
    }

    private static double hypotenuse(int a, int b) {

        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
