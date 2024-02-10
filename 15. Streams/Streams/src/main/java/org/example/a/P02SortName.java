package org.example.a;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class P02SortName {
    private static final String PATH_FROM = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P02\\from.txt";
    private static final String PATH_To = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P02\\to.txt";

    public static void main(String[] args) {
        Scanner scanner = null;
        PrintStream ps = null;

        try {
            File from = new File(PATH_FROM);
            scanner = new Scanner(from, StandardCharsets.UTF_8);
            List<String> list = new ArrayList<>(Arrays.stream(scanner.nextLine()
                            .split(", "))
                    .toList());
            Collections.sort(list);

            File to = new File(PATH_To);
            ps = new PrintStream(to, StandardCharsets.UTF_8);
            ps.println(list);

        } catch (IOException e) {
            System.out.println(e.getMessage());
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
