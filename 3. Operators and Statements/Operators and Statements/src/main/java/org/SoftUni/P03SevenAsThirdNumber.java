package org.SoftUni;

import java.util.Scanner;

public class P03SevenAsThirdNumber {
    private static boolean sevenCheck(int number) {
        int hundreds = number / 100;
        return hundreds == 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int argument = Integer.parseInt(scanner.nextLine());
        System.out.println(sevenCheck(argument));
    }
}
