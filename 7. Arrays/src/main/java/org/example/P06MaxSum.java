package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P06MaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());

        int[] array = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxSum = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length - k + 1; i++) {
            int currentSum = 0;
            List<Integer> currentNumbers = new ArrayList<>();
            for (int j = i; j < i + k; j++) {
                currentNumbers.add(array[j]);
                currentSum += array[j];
            }

            if (currentSum > maxSum) {
                result = currentNumbers;
                maxSum = currentSum;
            }
        }

        System.out.println(result);
    }


}
