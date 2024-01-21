package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P09SequenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());

        int[] array = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isFound = false;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isFound) {
                break;
            }
            int sum = 0;
            result = new ArrayList<>();

            for (int j = i; j < array.length; j++) {
                result.add(array[j]);
                sum += array[j];
                if (sum > target) {
                    break;
                }
                if (sum == target) {
                    isFound = true;
                    break;
                }
            }
        }

        System.out.println(result);
    }

}
