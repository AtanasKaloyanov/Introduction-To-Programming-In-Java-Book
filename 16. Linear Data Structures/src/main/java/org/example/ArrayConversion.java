package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayConversion {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        List<Integer> list = new ArrayList<>();

        for (int element : array) {
            list.add(element);
        }

        list.add(4);

        Integer[] result = list.toArray(new Integer[0]);
        System.out.println("The array has " + result.length + " elements.");
        System.out.println("The elements are: ");
        for (Integer current : result) {
            System.out.println(current);
        }

    }
}
