package org.example.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class P04FromStartToFinish {
    private static final String FROM_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P04\\from.txt";
    private static final String TO_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P04\\to.txt";
    private static final String START = "Start";
    private static final String FINISH = "Finish";
    public static void main(String[] args) {
        Scanner scanner = null;
        PrintStream ps = null;

        try {
            File from = new File(FROM_PATH);
            scanner = new Scanner(from, StandardCharsets.UTF_8);
            File to = new File(TO_PATH);
            ps = new PrintStream(to, StandardCharsets.UTF_8);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int index = line.indexOf(START);

                while (index != -1) {
                    String subs = line.substring(index, index + 5);
                    line = line.replace(subs, FINISH);
                    index = line.indexOf(line, index + 1);
                }

                ps.println(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }
}
