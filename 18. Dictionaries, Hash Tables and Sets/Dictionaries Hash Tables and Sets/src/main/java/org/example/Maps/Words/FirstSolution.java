package org.example.Maps.Words;

import java.util.Map;
import java.util.TreeMap;

public class FirstSolution {
    public static void main(String[] args) {
        String text = "alfa beta gama alfa";
        String[] textArray = text.split(" ");

        Map<String, Integer> dictionary = new TreeMap<>();

        for (int i = 0; i < textArray.length; i++) {
            String currentWord = textArray[i];
            dictionary.putIfAbsent(currentWord, 0);
            dictionary.put(currentWord, dictionary.get(currentWord) + 1);
        }

        dictionary.entrySet().forEach( (entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}