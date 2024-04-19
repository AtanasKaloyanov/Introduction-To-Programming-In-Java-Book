package org.example.Exam3.T02WordsCounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    private static Map<String, Integer> words = new LinkedHashMap();

    public static void main(String[] args) {
        // 1. Reading the words and adding them into a set
        Scanner scanner = null;
        PrintWriter pw = null;

        try {
            File wordsFile = new File("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exam3\\T02WordsCounter\\words.txt");
            scanner = new Scanner(wordsFile);
            addWordsToMap(scanner);

            // 2. Counting
            File textFile = new File("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exam3\\T02WordsCounter\\sample.txt");
            scanner = new Scanner(textFile);

            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < currentLine.length(); i++) {
                    char currentChar = currentLine.charAt(i);
                    if (Character.isLetter(currentChar)) {
                        sb.append(currentChar);
                    } else {
                        checkWord(sb);
                    }
                }
                checkWord(sb);
            }

            // 3. Printing the result
            File resultFile = new File("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exam3\\T02WordsCounter\\result.txt");
            pw = new PrintWriter(resultFile);
            printing(pw);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (pw != null) {
                pw.close();
            }
        }
    }

    private static void checkWord(StringBuilder sb) {
        String word = sb.toString().toLowerCase();
        words.keySet().forEach((key) -> {
            if (word.startsWith(key.toLowerCase())) {
                int wordsCount = words.get(key);
                words.put(key, wordsCount + 1);
            }
        });
        sb.setLength(0);
    }

    private static void printing(PrintWriter pw) {
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            pw.println(key + " " + value);
        }
    }

    private static void addWordsToMap(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            words.put(currentLine, 0);
        }
    }
}
