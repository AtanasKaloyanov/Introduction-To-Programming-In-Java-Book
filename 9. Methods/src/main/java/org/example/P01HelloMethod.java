package org.example;

import java.util.Scanner;

public class P01HelloMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        greeting(name);
    }

    private static void greeting(String name) {
        System.out.printf("Hello, %s!", name);
    }
}
