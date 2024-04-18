package org.example.Exam2.T01CountingWords;
import java.util.Scanner;

public class Main {
    private static StringBuilder separators = new StringBuilder();
    private static int allWords;
    private static int upperCaseWords;
    private static int lowerCaseWords;

    public static void main(String[] args) {
        //1. Reading the input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (emptyStringCheck(input)) return;

        // 2. Finding of all splitters of the input
        addSplitters(input);

        // 3. Splitting the input into an array using a splitter
        String[] words = splitting(input);

        // 4. Counting of the three types of words
        countWords(words);

        // 5. Printing of the result
        System.out.printf("All words: %d\n", allWords);
        System.out.printf("Upper case words: %d\n", upperCaseWords);
        System.out.printf("Lower case words: %d\n", lowerCaseWords);
    }

    private static boolean emptyStringCheck(String input) {
        if (input.equals("")) {
            System.out.println("The input is an empty String.");
            return true;
        }
        return false;
    }

    private static String[] splitting(String input) {
        String[] words;
        if (separators.toString().equals("")) {
            words = new String[1];
            words[0] = input;
        } else {
            String splitters = "[\\Q" + separators + "\\E]+";
            words = input.split(splitters);
        }
        return words;
    }

    private static void countWords(String[] words) {
        for (String word : words) {
                allWords++;
                if (word.equals(word.toLowerCase())) {
                    lowerCaseWords++;
                } else if (word.equals(word.toUpperCase())) {
                    upperCaseWords++;
                }
            }
        }

    private static void addSplitters(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!Character.isLetter(currentChar)) {
                separators.append(currentChar);
            }
        }
    }
}
