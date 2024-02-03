package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P04ForbiddenWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          String text = scanner.nextLine();
          List<String> words = Arrays.stream(scanner.nextLine().split(","))
                  .toList();
        System.out.println(censorText(text, words));
    }

    public static String censorText(String text, List<String> words) {
        for (String word : words) {
            String newWord = createNewWord(word);
            text = text.replaceAll(word, newWord);
        }
        return text;
    }

    private static String createNewWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
