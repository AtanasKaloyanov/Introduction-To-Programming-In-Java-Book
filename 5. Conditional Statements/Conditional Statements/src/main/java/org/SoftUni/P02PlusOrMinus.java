package org.SoftUni;

import java.util.Scanner;

public class P02PlusOrMinus {
    public static String quotientSign(double first, double second) {
        return first < 0 ^ second < 0 ? "-" : "+";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());

        System.out.println(quotientSign(first, second));
    }
}
