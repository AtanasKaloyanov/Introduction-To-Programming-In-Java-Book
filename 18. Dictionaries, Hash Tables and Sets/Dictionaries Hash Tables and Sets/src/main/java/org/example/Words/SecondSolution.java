package org.example.Words;

import java.util.*;

public class SecondSolution {
    private static String TEXT = "a a aa B b b";

    public static void main(String[] args) {
        Map<String, Integer> dictionary = createDictionary(TEXT);
        printDictionary(dictionary);
    }

    private static void printDictionary(Map<String, Integer> dictionary) {
        dictionary.entrySet()
                .forEach( (entry) ->
                        System.out.println(entry.getKey() + " " + entry.getValue()));
    }

    private static Map<String, Integer> createDictionary(String text) {
        Scanner scanner = new Scanner(TEXT);
        Comparator<String> ignoreComparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        };

        Map<String, Integer> dictionary = new TreeMap<>(ignoreComparator);

        while (scanner.hasNext()) {
            String currentWord = scanner.next();
            Integer currentWordCount = dictionary.get(currentWord);

            if (currentWordCount == null) {
                currentWordCount = 0;
            }

            dictionary.put(currentWord, currentWordCount + 1);
        }

        return dictionary;
    }
}
