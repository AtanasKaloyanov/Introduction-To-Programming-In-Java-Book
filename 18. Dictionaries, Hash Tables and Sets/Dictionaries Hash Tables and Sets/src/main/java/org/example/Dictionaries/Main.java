package org.example.Dictionaries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer>[] array = new List[3];
        array[0] = List.of(1, 2, 3);
        array[1] = List.of(2, 3, 4);
        array[2] = List.of(3, 4, 5);

        Arrays.fill(array, null);

        for (List<Integer> list : array) {
            System.out.println(list);
        }

       int number = (int) (5.0 * 2.12);
        System.out.println(number);

        Map<String, Integer> map = new HashMap<>();
    }
}
