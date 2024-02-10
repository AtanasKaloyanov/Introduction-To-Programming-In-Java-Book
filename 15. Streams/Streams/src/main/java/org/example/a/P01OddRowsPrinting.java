package org.example.a;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class P01OddRowsPrinting {
    private static final String FILE_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\P01\\from.txt";

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            File file = new File(FILE_PATH);
            scanner = new Scanner(file, StandardCharsets.UTF_8);
            int counter = 1;

            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                if (counter % 2 != 0) {
                    System.out.println(currentLine);
                }
                counter++;
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
