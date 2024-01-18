package org.SoftUni;

import java.util.Scanner;

public class P09IsInTheCircleAndOutsideTheRect {
    private static final int RADIUS = 5;
    private static final int RECT_X1 = -1;
    private static final int RECT_Y1 = 1;
    private static final int RECT_X2 = 5;
    private static final int RECT_Y2 = 5;
    public static boolean inCircleOutTheRect(int x, int y) {
        boolean isInTheCircle = x * x + y * y <= RADIUS * RADIUS;
        boolean outsideTheRect = x < RECT_X1 || x > RECT_X2 || y < RECT_Y1 || y > RECT_Y2;

        return isInTheCircle && outsideTheRect;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        System.out.println(inCircleOutTheRect(x, y));
    }
}
