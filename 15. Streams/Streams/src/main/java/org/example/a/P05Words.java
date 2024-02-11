package org.example.a;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Words {
    private static final String WORDS_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P05\\words.txt";
    private static final String TEXT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P05\\text.txt";
    private static final String RESULT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P05\\result.txt";

    public static void main(String[] args) {
        Scanner scanner = null;
        PrintStream ps = null;

        try {
            File wordsFile = new File(WORDS_PATH);
            scanner = new Scanner(wordsFile, StandardCharsets.UTF_8);
            String[] words = scanner.nextLine().split(" ");
            Map<String, Integer> map = new HashMap<>();

            for (String current : words) {
                map.put(current, 0);
            }

            File textFile = new File(TEXT_PATH);
            scanner = new Scanner(textFile, StandardCharsets.UTF_8);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] worldsLine = line.split(" ");

                for (String current : worldsLine) {
                    if (map.containsKey(current)) {
                        int newCount = map.get(current) + 1;
                        map.put(current, newCount);
                    }
                }
            }

            File resultFile = new File(RESULT_PATH);
            ps = new PrintStream(resultFile, StandardCharsets.UTF_8);

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                ps.println("word: " + entry.getKey() + ", count: " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
