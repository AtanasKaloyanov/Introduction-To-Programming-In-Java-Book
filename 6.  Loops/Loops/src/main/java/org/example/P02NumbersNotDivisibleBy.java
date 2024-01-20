package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02NumbersNotDivisibleBy {
    private static List<Integer> numberNotDivisbleBy3And7(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) || (i % 7 == 0)) {
                continue;
            }
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(numberNotDivisbleBy3And7(number));
    }
}
