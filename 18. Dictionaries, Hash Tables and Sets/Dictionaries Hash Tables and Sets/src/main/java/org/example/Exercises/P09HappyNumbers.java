package org.example.Exercises;

import java.util.*;

public class P09HappyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> givenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();

        int luckyNumber = Integer.parseInt(scanner.nextLine());
        Comparator<List<Integer>> comp = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return Integer.compare(o2.size(), o1.size());
            }
        };

        TreeSet<List<Integer>> result = new TreeSet<>(comp);

          for (int i = 0; i < result.size(); i++) {
              List<Integer> list = new ArrayList<>();
              int currentNumber = givenNumbers.get(i);
              list.add(currentNumber);
              int sum = list.stream()
                      .mapToInt((element) -> element.intValue())
                      .sum();

              if (sum == luckyNumber) {
                  result.add(list);
                  if (result.size() == 10) {
                      break;
                  }
              }
          }
          
        System.out.println(result);
    }
}
