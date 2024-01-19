package org.SoftUni;

import java.util.Scanner;

public class P02PerimerterAndAreOfACircle {
    private static double circleArea(double r) {
        return Math.PI * r * r;
    }

    public static double circlePerimeter(double r) {
        return Math.PI * 2 * r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println(circleArea(radius));
        System.out.println(circlePerimeter(radius));
    }
}
