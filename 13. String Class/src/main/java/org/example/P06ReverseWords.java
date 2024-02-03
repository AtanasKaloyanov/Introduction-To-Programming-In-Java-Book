package org.example;

import java.util.Scanner;

public class P06ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(reverseString(input));
    }
    private static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        String[] words = input.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            String currentWord = words[i];
            sb.append(currentWord);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
