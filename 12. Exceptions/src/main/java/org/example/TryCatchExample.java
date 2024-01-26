package org.example;

import java.io.*;

public class TryCatchExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\12. Exceptions\\Exceptions\\src\\main\\java\\org\\example\\alabala.txt");
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
            try {
                String currentLine = bf.readLine();
                while (currentLine != null) {
                    System.out.println(currentLine);
                    currentLine = bf.readLine();
                }
            } finally {
                bf.close();
            }
        } finally {
            fis.close();
        }
    }
}