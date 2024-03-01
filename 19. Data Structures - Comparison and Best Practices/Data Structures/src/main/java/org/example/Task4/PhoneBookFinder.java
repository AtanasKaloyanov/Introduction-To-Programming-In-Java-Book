package org.example.Task4;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class PhoneBookFinder {
    private final static String INFORMATION_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\19. Data Structures - Comparison and Best Practices\\Data Structures\\src\\main\\java\\org\\example\\Task4\\information.txt";
    private final static String QUERIES_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\19. Data Structures - Comparison and Best Practices\\Data Structures\\src\\main\\java\\org\\example\\Task4\\queries.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(INFORMATION_PATH);
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);

        Map<String, List<String>> phonebook = new HashMap<>();

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            // Киро Киров | Варна | 052 / 23 45 67
            String[] personInformation = currentLine.split("\\s*\\|\\s*");
            String[] nameInformation = personInformation[0].split("\\s++");
            String town = personInformation[1];
            String phoneNumber = personInformation[2];

            for (String currentName : nameInformation) {
                // adding currentName as Key
                phonebook.putIfAbsent(currentName, new ArrayList<>());
                phonebook.get(currentName).add(currentLine);

                // adding conc(currentName + town) as key
                String nameAndTown = currentName + " from " + town;
                phonebook.putIfAbsent(nameAndTown, new ArrayList<>());
                phonebook.get(nameAndTown).add(currentLine);
            }
        }

        File commands = new File(QUERIES_PATH);
        Scanner secondScanner = new Scanner(commands, StandardCharsets.UTF_8);

        while (secondScanner.hasNextLine()) {
            String currentLine = secondScanner.nextLine();
            if (currentLine.contains("list")) {
                String name = currentLine.replaceAll("[list()]", "");
                printing(phonebook, name);
            } else if (currentLine.contains("find")) {
                currentLine = currentLine.replaceAll("[find()]", "");
                String[] nameAndTown = currentLine.split(", ");
                String name = nameAndTown[0];
                String town = nameAndTown[1];
                String nameAndTownS = name + " from " + town;
                printing(phonebook, nameAndTownS);
            }
        }

    }

    private static void printing(Map<String, List<String>> phoneBook, String name) {
        if (!phoneBook.containsKey(name)) {
            System.out.printf("Not found information with key \"%s\"", name);
            System.out.println();
            System.out.println();
        } else {
            List<String> informationByName = phoneBook.get(name);
            System.out.println("Name: " + name);
            for (String currentInfo : informationByName) {
                System.out.println("   " + currentInfo);
            }
            System.out.println();
        }
    }
}


