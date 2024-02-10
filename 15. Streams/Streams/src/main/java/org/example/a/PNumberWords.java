package org.example.a;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PNumberWords {
    public static void main(String[] args) {
        Scanner scanner = null;
        String word = "Java";
        int occurences = 0;

        try {
            File file = new File("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\text.txt");
            scanner = new Scanner(file, StandardCharsets.UTF_8);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int index = line.indexOf(word);
                while (index != -1) {
                    occurences++;
                    index = line.indexOf(word, index + 1);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        System.out.println(occurences);
    }
}
