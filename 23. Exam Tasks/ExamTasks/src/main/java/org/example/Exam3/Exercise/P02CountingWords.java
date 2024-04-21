package org.example.Exam3.Exercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class P02CountingWords {
    private static final String WORDS_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exam3\\Exercise\\P02Files\\words.txt";
    private static final String TEXT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exam3\\Exercise\\P02Files\\input.txt";
    private static final String OUTPUT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exam3\\Exercise\\P02Files\\output.txt";

    private static Map<String, Integer> words = new LinkedHashMap();

    public static void main(String[] args) {

        // 1. Reading of the input words and adding them into a map
        Scanner scanner = null;
        PrintWriter writer = null;
        try {
            File wordsFile = new File(WORDS_PATH);
            scanner = new Scanner(wordsFile, StandardCharsets.UTF_8);
            wordsFilling(scanner);

            // 2. Reading the text line after line and checking for a match with the words in the map
            File textFile = new File(TEXT_PATH);
            scanner = new Scanner(textFile, StandardCharsets.UTF_8);
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                String[] currentWords = currentLine.split("\\s++");
                for (String currentWord : currentWords) {
                    if (words.containsKey(currentWord)) {
                        int lastCount = words.get(currentWord);
                        words.put(currentWord, lastCount + 1);
                    }
                }
            }

            // 3. Output Printing
            writer = new PrintWriter(OUTPUT_PATH, StandardCharsets.UTF_8);
            for (Map.Entry<String, Integer> entry : words.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                writer.println(key + " - " + value);
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }

            if (writer != null) {
                writer.close();
            }
        }

    }

    private static void wordsFilling(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String currentWord = scanner.nextLine();
            words.put(currentWord, 0);
        }
    }


}
