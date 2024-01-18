package org.SoftUni;

import java.util.Scanner;

public class P04ThirdBit {
    private static boolean isThirdBit1(int number) {
        return ((number >> 2) & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int argument = Integer.parseInt(scanner.nextLine());
        System.out.println(isThirdBit1(argument));
    }
}
