package org.example.Exam2.Exercise;

import java.util.Scanner;

public class P01CountingWordsSbSolution {
    private static StringBuilder sb = new StringBuilder();
    private static int allWordsCounter;
    private static int lowerCaseWordsCounter;
    private static int upperCaseWordsCounter;

    public static void main(String[] args) {
        // 1. Input Reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Adding every char of the input into an StringBuilder using for cycle
        // If the current char isn't a letter then the content of the stringbuilder is a word.
        // Then counting of the word.
        // Then the stringbuilber's length should be set on 0;
        countingWords(input);

        // 3. Counters Printing
        System.out.printf("All words: %d\n", allWordsCounter);
        System.out.printf("Lower case words: %d\n", lowerCaseWordsCounter);
        System.out.printf("Upper case words: %d\n", upperCaseWordsCounter);
    }

    private static void countingWords(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                sb.append(currentChar);
            } else {
                if (!sb.toString().equals("")) {
                    String word = sb.toString();
                    allWordsCounter++;
                    if (word.toLowerCase().equals(word)) {
                        lowerCaseWordsCounter++;
                    } else if (word.toUpperCase().equals(word)) {
                        upperCaseWordsCounter++;
                    }

                    sb.setLength(0);
                }
            }
        }
    }
}
