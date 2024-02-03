package org.example;

import java.util.Scanner;

public class P02WordOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println(occFinder(text, word));
    }

    private static int occFinder(String text, String word) {
        text = text.toLowerCase();
        int number = 0;
        int index = text.indexOf(word);
        while (index != -1) {
            number++;
            index = text.indexOf(word, index + 1);
        }
        return number;
    }
}
