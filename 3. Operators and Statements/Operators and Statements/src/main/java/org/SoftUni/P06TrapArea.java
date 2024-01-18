package org.SoftUni;

import java.util.Scanner;

public class P06TrapArea {
    private static double trapArea(double a, double b, double h) {
        return ((a + b) * h) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        System.out.println(trapArea(a, b, h));
    }

}
