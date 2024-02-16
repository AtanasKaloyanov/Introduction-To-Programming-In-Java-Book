package org.example.Exercises;

import java.util.*;

public class P09HappyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> givenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();

        int luckyNumber = Integer.parseInt(scanner.nextLine());

         List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < givenNumbers.size(); i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < givenNumbers.size(); j++) {
                int currentNumber = givenNumbers.get(j);
                list.add(currentNumber);

                int listSum = list.stream()
                        .mapToInt((element) -> element.intValue())
                        .sum();

                if (listSum == luckyNumber) {
                    result.add(list);
                    list = new ArrayList<>(list);
                }
            }
        }

        result.stream()
                .sorted( (entry1, entry2) -> Integer.compare(entry2.size(), entry1.size()))
                .limit(10)
                .forEach( (entry) -> System.out.println(entry));



    }
}
