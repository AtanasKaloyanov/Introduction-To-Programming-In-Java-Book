package org.example.Task3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\19. Data Structures - Comparison and Best Practices\\Data Structures - Comparison and Best Practices\\src\\main\\java\\org\\example\\Task3\\text.txt";
        File file = new File(path);

        FileInputStream fis = new FileInputStream(file);
        InputStreamReader ios = new InputStreamReader(fis, "UTF-8");
        BufferedReader bf = new BufferedReader(ios);

        String line;
        Map<String, TreeMap<String, String>> map = new TreeMap<>();

        while ((line = bf.readLine()) != null) {
            String[] information = line.split("\\s*\\|\\s*");
            String firstName = information[0];
            String town = information[1];
            String number = information[2];

            map.putIfAbsent(town, new TreeMap<>());
            map.get(town).put(firstName, number);
        }

        map.entrySet().forEach((entry) -> {
            String townName = entry.getKey();
            Map<String, String> citizens = entry.getValue();

            System.out.println("Tonw: " + townName);
            citizens.entrySet().forEach((entry2) -> {
                System.out.println("   " + entry2.getKey() + " - " + entry2.getValue());
            });
        });
    }
}
