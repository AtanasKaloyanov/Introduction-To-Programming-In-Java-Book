package org.example.Exam2.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03IntegerCalculator {
    public static void main(String[] args) {
        // 1. Reading of the input - a string
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        // 2. Deviding and Multiplication
        multiplicationAndDivision(sb);

        // 3. Adding and Subtraction
        // 3.1 Initialising 2 lists - the first is only with numbers and the second is only with signs (plus or minus)

        List<Integer> numbers = getNumbers(sb.toString());

        List<Character> signs = new ArrayList<>();
        addOnlySigns(sb.toString(), signs);

        // 3.2 Initialising a sum variable (the result), adding the first number into the result and also removing it from the numbers
        int sum = 0;
        sum += numbers.get(0);
        numbers.remove(0);

        // 3.3 Adding and subtraction using for cycle
        sum = subtractOrAdd(numbers, signs, sum);

        // 4. Printing the result
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

    private static void multiplicationAndDivision(StringBuilder sb) {
        boolean multiOrDiv = true;
        while (multiOrDiv) {
            for (int i = 0; i < sb.length(); i++) {
                char currentChar = sb.charAt(i);
                if ((currentChar == ':') || (currentChar == '.')) {
                    int firstIndex = getFirstIndex(sb, i);
                    int numberBeforeSign = Integer.parseInt(sb.substring(firstIndex, i));

                    int lastIndex = getLastIndex(sb, i);
                    int numberAfterSign = Integer.parseInt(sb.substring(i + 1, lastIndex));

                    int result = getResult(currentChar, numberBeforeSign, numberAfterSign);

                    sb.replace(firstIndex, lastIndex, String.valueOf(result));
                    multiOrDiv = true;
                    break;
                }
                multiOrDiv = false;
            }

        }
    }

    private static int getResult(char currentChar, int numberBeforeSign, int numberAfterSign) {
        int result = 0;
        if (currentChar == ':') {
            result = numberBeforeSign / numberAfterSign;
        } else {
            result = numberBeforeSign * numberAfterSign;
        }
        return result;
    }

    private static int getLastIndex(StringBuilder sb, int i) {
        int lastIndex = i + 1;
        while (lastIndex < sb.length() && Character.isDigit(sb.charAt(lastIndex))) {
            lastIndex++;
        }
        return lastIndex;
    }

    private static int getFirstIndex(StringBuilder sb, int i) {
        int firstIndex = i - 1;
        while (firstIndex > 0 && Character.isDigit(sb.charAt(firstIndex - 1))) {
            firstIndex--;
        }
        return firstIndex;
    }
}
