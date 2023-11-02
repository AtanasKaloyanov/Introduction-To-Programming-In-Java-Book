package org.example.Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PhoneBookFinderSecondSolution {
      private static final String PHONE_BOOK_FILE = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\19. Data Structures - Comparison and Best Practices\\Data Structures\\src\\main\\java\\org\\example\\Task4\\information.txt";
    private static final String QUEIRES_FILE = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\19. Data Structures - Comparison and Best Practices\\Data Structures\\src\\main\\java\\org\\example\\Task4\\queries.txt";
    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<String>> phoneBook = readPhoneBook();
        processQueries(QUEIRES_FILE, phoneBook);
    }
    private static HashMap<String, ArrayList<String>> readPhoneBook() throws IOException {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner input = new Scanner(new File(PHONE_BOOK_FILE), StandardCharsets.UTF_8);
        try {
            while (input.hasNext()) {
                String entry = input.nextLine();
                String[] phoneBookEntry = entry.split("\\s*\\|\\s*");
                String names = phoneBookEntry[0];
                String town = phoneBookEntry[1];
                String[] nameTokens = names.split("\\s+");
                for (String name : nameTokens) {
                    addToPhoneBook(phoneBook, name, entry);
                    String nameAndTown = combineNameAndTown(town, name);
                    addToPhoneBook(phoneBook, nameAndTown, entry);
                }
            }
        } finally {
            input.close();
        }
        return phoneBook;
    }
    private static String combineNameAndTown(
            String town, String name) {
        return name + " от " + town;
    }
    private static void addToPhoneBook(
            HashMap<String, ArrayList<String>> phoneBook, String name, String entry) {
        name = name.toLowerCase();
        ArrayList<String> entries = phoneBook.get(name);
        if (entries == null) {
            entries = new ArrayList<>();
            phoneBook.put(name, entries);
        }

        entries.add(entry);
    }
    private static void processQueries(String fileName, HashMap<String, ArrayList<String>> phoneBook) throws IOException {
        Scanner input = new Scanner(new File(fileName), "UTF-8");
        try {
            while (input.hasNext()) {
                String query = input.nextLine();
                processQuery(phoneBook, query);
            }
        } finally {
            input.close();
        }
    }
    private static void processQuery(HashMap<String, ArrayList<String>> phoneBook, String query) {
        if (query.startsWith("list(")) {
            String name = query.substring("list(".length(), query.length()-1);
            name = name.trim().toLowerCase();
            printAllMatches(name, phoneBook);
        } else if (query.startsWith("find(")) {
            int commaIndex = query.indexOf(',');
            String name = query.substring("find(".length(), commaIndex);
            name = name.trim().toLowerCase();
            String town = query.substring(commaIndex+1, query.length()-1);
            town = town.trim().toLowerCase();
            String nameAndTown = combineNameAndTown(town, name);
            printAllMatches(nameAndTown, phoneBook);
        } else {
            System.out.println(query + " is invalid command!");
        }
    }
    private static void printAllMatches(String key, HashMap<String, ArrayList<String>> phoneBook) {
        List<String> allMatches = phoneBook.get(key);
        if (allMatches != null) {
            for (String entry : allMatches) {
                System.out.println(entry);
            }
        } else {

            System.out.println("Not found!");
        }
        System.out.println();
    }
}

// Name: Киро
//   Киро Киров | Варна | 052 / 23 45 67
//   Киро Киров Иванов | Пловдив | 0888 / 22 33 44
//   Киро | Плевен | 064 / 88 77 66
//   Киро бирата | Варна | 0897 / 44 55 66
//   Киро | Плевен | 0897 / 44 55 66
//
//Not found information with key "Пешо from София"
//
//Name: Лили
//   Лили Иванова | София | 0899 / 11 22 33
//
//Name: Киров
//   Киро Киров | Варна | 052 / 23 45 67
//   Киро Киров Иванов | Пловдив | 0888 / 22 33 44
//
//Name: Иванов from Пловдив
//   Киро Киров Иванов | Пловдив | 0888 / 22 33 44
//
//Not found information with key "Баба"