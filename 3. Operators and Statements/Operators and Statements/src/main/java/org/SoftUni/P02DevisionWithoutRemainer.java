package org.SoftUni;

import java.util.Scanner;

public class P02DevisionWithoutRemainer {
    private static boolean devisionWithoutRemainer(int number) {
        return (number % 5 == 0) && (number % 7 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int argument = Integer.parseInt(scanner.nextLine());
        System.out.println(devisionWithoutRemainer(argument));
    }
}
