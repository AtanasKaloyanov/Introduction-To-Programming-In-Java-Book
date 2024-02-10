package org.example.a;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SubChange {
    private static final double CONST = 1.01;
    private static final String FILE_PATH_FROM = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\PSubChange\\from.txt";
    private static final String FILE_PATH_TO = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\PSubChange\\to.txt";

    public static void main(String[] args) {
        Scanner scanner = null;
        PrintStream printStream = null;

        try {
            File fileFrom = new File(FILE_PATH_FROM);
            File filTo = new File(FILE_PATH_TO);
            scanner = new Scanner(fileFrom, StandardCharsets.UTF_8);
            printStream = new PrintStream(filTo, StandardCharsets.UTF_8);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = changeSubs(line);
                printStream.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }

            if (printStream != null) {
                printStream.close();
            }
        }
    }

    private static String changeSubs(String line) {
        String begin = line.substring(1, 5);
        String end = line.substring(7, 11);
        int newfirstNumber = (int) Math.abs(CONST * Integer.parseInt(begin));
        int newsecondNumber = (int) Math.abs(CONST * Integer.parseInt(end));
        line = line.replace(begin, String.valueOf(newfirstNumber));
        line = line.replace(end, String.valueOf(newsecondNumber));
        return line;
    }
}
