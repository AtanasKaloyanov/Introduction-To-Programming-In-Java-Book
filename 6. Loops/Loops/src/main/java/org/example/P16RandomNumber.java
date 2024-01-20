package org.example;

import java.util.Random;
import java.util.Scanner;

public class P16RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(random(number));
    }
    private static int random(int number) {
        Random random = new Random();
        return random.nextInt(number) + 1;
    }
}
