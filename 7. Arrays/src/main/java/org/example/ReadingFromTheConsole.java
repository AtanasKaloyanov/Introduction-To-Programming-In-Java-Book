package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromTheConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int[] array = Arrays.stream(line.split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(Arrays.toString(array));
    }
}