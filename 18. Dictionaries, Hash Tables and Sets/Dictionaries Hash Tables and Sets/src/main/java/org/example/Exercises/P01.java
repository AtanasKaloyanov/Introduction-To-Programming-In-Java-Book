package org.example.Exercises;


import java.util.*;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine().split(", "))
                .map((number) -> Integer.parseInt(number))
                .toList());

        Map<Integer, Integer> numberMap = new HashMap<>();
        for (Integer number : numbers) {
            numberMap.putIfAbsent(number, 0);
            int occurances = numberMap.get(number);
            numberMap.put(number, occurances + 1);
        }

        numberMap.entrySet()
                        .forEach( (entry) -> {
                            int key = entry.getKey();
                            int value = entry.getValue();

                            if (value % 2 != 0) {
                                numbers.removeIf((element) -> element == key);
                            }
                        });

        System.out.println(numbers.toString().replaceAll("[,\\[\\]]", ""));
    }
}
