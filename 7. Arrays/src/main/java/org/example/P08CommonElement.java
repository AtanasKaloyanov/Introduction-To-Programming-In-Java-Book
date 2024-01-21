package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class P08CommonElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Map<Integer, Integer> map = new HashMap<>();
        for (int current : array) {
            map.putIfAbsent(current, 0);
            map.put(current, map.get(current) + 1);
        }

      Map.Entry<Integer, Integer> result = map.entrySet().stream()
               .sorted(Comparator.comparing( (entry) -> entry.getValue()))
               .collect(Collectors.toList()).get(map.size() - 1);

        System.out.printf("The searched element is %d. It is repeated %d times.", result.getKey(), result.getValue());
    }
}
