package org.SoftUni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P07FiveNumbers {
    private static final int biggerNumber(int first, int second, int third, int fourth, int fifth) {
        List<Integer> list = new ArrayList<>(List.of(first, second, third, fourth, fifth));
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());
        int fifth = Integer.parseInt(scanner.nextLine());

        System.out.println(biggerNumber(first, second, third, fourth, fifth));
    }
}
