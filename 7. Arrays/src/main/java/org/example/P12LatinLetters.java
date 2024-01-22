package org.example;

import java.util.Scanner;

public class P12LatinLetters {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        char[] array = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char ch : array) {
            for (int i = 0; i < letters.length; i++) {
                char letter = letters[i];
                if (ch == letter) {
                    result.append(i).append(" ");
                    break;
                }
            }
        }
        System.out.println(result);
    }
}

