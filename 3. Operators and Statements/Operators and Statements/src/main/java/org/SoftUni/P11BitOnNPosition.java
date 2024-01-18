package org.SoftUni;

import java.util.Scanner;

public class P11BitOnNPosition {
    public static int zeroOrOne(int n, int p) {
       return ((n >> p) & 1) == 1 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        System.out.println(zeroOrOne(n, p));
    }
}
