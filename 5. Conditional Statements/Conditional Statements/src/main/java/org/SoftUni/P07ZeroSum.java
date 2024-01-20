package org.SoftUni;

import java.util.Scanner;
import java.util.TreeSet;

public class P07ZeroSum {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int first = Integer.parseInt(scanner.nextLine());
          int second = Integer.parseInt(scanner.nextLine());
          int third = Integer.parseInt(scanner.nextLine());

        System.out.println(zeroSumNumbers(first, second, third));
    }

    private static TreeSet<Integer> zeroSumNumbers(int number1, int number2, int number3) {
        TreeSet<Integer> result = new TreeSet<>();
        sumByZeroSubstr(number1, number2, result);
        sumByZeroSubstr(number1, number3, result);
        sumByZeroSubstr(number2, number3, result);

        return result;
    }

    private static void sumByZeroSubstr(int number1, int number2, TreeSet<Integer> treeSet) {
        if (Math.abs(number1) - Math.abs(number2) == 0) {
            treeSet.add(number1);
            treeSet.add(number2);
        }
    }
}
