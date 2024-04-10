package org.example.Exercise.T01Emails;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String INPUT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exercise\\T01Emails\\mails.txt";
    private static final String OUTPUT_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\Exercise\\T01Emails\\validMails.txt";
    private static final String REGEX = "^(\\w+) (\\w+) ([a-zA-z_]+)(@{1})([a-z]+)(\\.{1})([a-z]{2,4})$";

    public static void main(String[] args) {
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {
            File file = new File(INPUT_PATH);
            scanner = new Scanner(file, StandardCharsets.UTF_8);
            printWriter = new PrintWriter(OUTPUT_PATH, StandardCharsets.UTF_8);

            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                Pattern pattern = Pattern.compile(REGEX);
                Matcher matcher = pattern.matcher(currentLine);

                if (matcher.find()) {
                    printWriter.println(currentLine);
                }

            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }

    // <first name> <last name> <username>@<host>.<domain>
}
