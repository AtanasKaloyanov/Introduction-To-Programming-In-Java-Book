package org.example.a;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintingFromFileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\from.txt");
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}