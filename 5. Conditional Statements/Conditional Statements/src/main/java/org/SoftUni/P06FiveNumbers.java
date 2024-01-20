package org.SoftUni;

import java.util.*;

public class P06FiveNumbers {
    public static int theBiggestNumber(int first, int second, int third, int fourth, int fifth) {
        List<Integer> result = new ArrayList<>(List.of(first, second, third, fourth, fifth));
        Collections.sort(result);
        return result.get(result.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());
        int fifth = Integer.parseInt(scanner.nextLine());

        System.out.println(theBiggestNumber(first, second, third, fourth, fifth));
    }
}
