package org.SoftUni;

import java.util.Scanner;

public class P08BonusPoints {
    public static int bonus(int number) {
        int result;
        if (number == 0) {
            throw new IllegalArgumentException("Zero points.");
        } else if (number <= 3) {
            result = number * 10;
        } else if (number <= 6) {
            result = number * 100;
        } else if (number <= 9) {
            result = number * 1000;
        } else {
            throw new IllegalArgumentException("The points are more than 9");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(bonus(number));
    }
}
