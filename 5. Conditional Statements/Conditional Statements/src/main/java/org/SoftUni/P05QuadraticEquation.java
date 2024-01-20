package org.SoftUni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05QuadraticEquation {
    private static List<Double> quaEquaRoots(int a, int b, int c) {
        List<Double> result = new ArrayList<>();
        double x1;
        double x2;
        double descr = b * b - 4 * a * c;
        if (descr > 0) {
            x1 = (-b + Math.sqrt(descr)) / 2.0 * a;
            x2 = (b + Math.sqrt(descr)) / 2.0 * a;
            result.add(x1);
            result.add(x2);
        } else if (descr == 0) {
            x1 = b / 2.0 * a;
            result.add(x1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        List<Double> result = quaEquaRoots(first, second, third);

        if (result.size() == 2) {
            System.out.printf("The first root is %.2f and the second root is %.2f.", result.get(0), result.get(1));
        } else if (result.size() == 1) {
            System.out.printf("The equation has only one root - %.2f.", result.get(0));
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
