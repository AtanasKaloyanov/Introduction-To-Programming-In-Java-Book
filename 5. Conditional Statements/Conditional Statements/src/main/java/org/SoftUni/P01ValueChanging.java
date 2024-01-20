package org.SoftUni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01ValueChanging {
    private static List<Integer> valueChanger(int first, int second) {
        List<Integer> twoIntegers = new ArrayList<>(List.of(first, second));
        if (first > second) {
            twoIntegers.set(0, second);
            twoIntegers.set(1, first);
        }
        return twoIntegers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        List<Integer> result = valueChanger(first, second);
        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }
}
