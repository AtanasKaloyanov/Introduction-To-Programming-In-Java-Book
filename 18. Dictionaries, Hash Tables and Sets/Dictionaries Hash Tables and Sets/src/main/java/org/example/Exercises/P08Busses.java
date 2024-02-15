package org.example.Exercises;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P08Busses {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            File file = new File("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\18. Dictionaries, Hash Tables and Sets\\Dictionaries Hash Tables and Sets\\src\\main\\resources\\P06Data.txt");
            scanner = new Scanner(file, StandardCharsets.UTF_8);
            String firstLine = scanner.nextLine();
            String secondLine = scanner.nextLine();

            int givenBeginMinutes = calcMinutes(secondLine).get(0);
            int givenEndMinutes = calcMinutes(secondLine).get(1);

            List<String> result = new ArrayList<>();
            List<String> data = Arrays.stream(firstLine.split(", "))
                    .toList();

            for (String datum : data) {
                int startMinutes = calcMinutes(datum).get(0);
                int finalMinutes = calcMinutes(datum).get(1);

                if (startMinutes >= givenBeginMinutes && finalMinutes <= givenEndMinutes) {
                    result.add(datum);
                }
            }

            System.out.println(result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static List<Integer> calcMinutes(String datum) {
        int beginHours = Integer.parseInt(datum.substring(1, 3));
        int beginMinutes = Integer.parseInt(datum.substring(4, 6));
        int endHours = Integer.parseInt(datum.substring(7, 9));
        int endMinutes = Integer.parseInt(datum.substring(10, 12));

        int startMinutes = beginHours * 60 + beginMinutes;
        int finalMinutes = endHours * 60 + endMinutes;
        return new ArrayList<>(List.of(startMinutes, finalMinutes));
    }
}

