package org.SoftUni;

import java.util.Scanner;

public class P05PerimeterAndAreaOfARectangular {
    private static double perimeterComp(double width, double length) {
        return 2 * width + 2 * length;
    }
    private static double areaComp(double width, double length) {
        return width * length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        System.out.println(perimeterComp(width, length));
        System.out.println(areaComp(width, length));
    }
}
