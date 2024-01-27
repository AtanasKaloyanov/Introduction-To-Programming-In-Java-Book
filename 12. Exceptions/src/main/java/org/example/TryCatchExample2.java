package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchExample2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(new File("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\12. Exceptions\\Exceptions\\src\\main\\java\\org\\example\\alabala.txt"));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Wrong filename");
        }

    }
}
