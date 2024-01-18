package org.SoftUni;

import java.util.Scanner;

public class P08PointInTheCircle {
    private static boolean isIntheCircle(int x, int y) {
        return x * x + y * y <= 25;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println(isIntheCircle(x, y));
    }
}
