package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(counter(number, array));
    }

    public static int counter(int number, int[] array) {
        int result = 0;
        for (int current : array) {
            if (current == number) {
                result++;
            }
        }
        return result;
    }
}
