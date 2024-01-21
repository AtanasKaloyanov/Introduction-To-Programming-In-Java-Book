package org.example;

import java.util.Arrays;

public class ArrayReversed {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int length = numbers.length;
        int[] numbersReversed = new int[length];

        for (int i = 0; i < length; i++) {
            numbersReversed[i] = numbers[length - i - 1];
        }

        System.out.println(Arrays.toString(numbersReversed));
    }
}
