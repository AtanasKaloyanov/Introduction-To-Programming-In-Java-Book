package org.example.Exam2.T03AddingOrSubtraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Reading of the input - a string
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Initialising 2 lists - the first is only with numbers and the second is only with signs (plus or minus)

        List<Integer> numbers = getNumbers(input);

        List<Character> signs = new ArrayList<>();
        addOnlySigns(input, signs);

        // 3. Initialising a sum variable (the result), adding the first number into the result and also removing it from the numbers
        int sum = 0;
        sum += numbers.get(0);
        numbers.remove(0);

        // 4. Adding and subtraction using for cycle
        sum = subtractOrAdd(numbers, signs, sum);

        // 5. Printing the result
        System.out.println(sum);
    }

    private static int subtractOrAdd(List<Integer> numbers, List<Character> signs, int sum) {
        for (int i = 0; i < signs.size(); i++) {
            int currentNumber = numbers.get(i);
            char currentChar = signs.get(i);

            if (currentChar == '+') {
                sum += currentNumber;
            } else {
                sum -= currentNumber;
            }
        }
        return sum;
    }

    private static void addOnlySigns(String input, List<Character> signs) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if ((currentChar == '+') || (currentChar == '-')) {
                signs.add(currentChar);
            }
        }
    }

    private static ArrayList<Integer> getNumbers(String input) {
        return new ArrayList<>(Arrays.stream
                        (input.split("\\D"))
                .map(Integer::parseInt)
                .toList());
    }


}

