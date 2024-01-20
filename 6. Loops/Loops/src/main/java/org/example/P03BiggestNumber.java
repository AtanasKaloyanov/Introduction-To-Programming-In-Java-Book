package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P03BiggestNumber {
    private static List<Integer> biggestNumber(int first, int second, int third) {
        List<Integer> result = new ArrayList<>(List.of(first, second, third));
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(biggestNumber(first, second, third));
    }
}
