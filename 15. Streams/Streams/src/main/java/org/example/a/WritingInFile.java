package org.example.a;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WritingInFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\15. Streams\\Streams\\src\\main\\resources\\to.txt");
        PrintStream ps = new PrintStream(file, StandardCharsets.UTF_8);

        for (int i = 1; i <= 20; i++) {
            ps.println(i);
        }

        ps.close();
    }
}
