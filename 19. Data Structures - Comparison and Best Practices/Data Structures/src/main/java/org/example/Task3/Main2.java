package org.example.Task3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\19. Data Structures - Comparison and Best Practices\\Data Structures\\src\\main\\java\\org\\example\\Task3\\text.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file, StandardCharsets.UTF_8);
            TreeMap<String, TreeSet<Person>> telBook = new TreeMap<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(" \\| ");
                String personName = data[0];
                String town = data[1];
                String telNumber = data[2];

                Person person = new Person(personName, telNumber);
                telBook.putIfAbsent(town, new TreeSet<>());
                TreeSet<Person> people = telBook.get(town);
                people.add(person);
            }

            telBook.entrySet().forEach( (entry) -> {
                String key = entry.getKey();
                TreeSet<Person> value = entry.getValue();
                System.out.print("In " + key + " live: " + System.lineSeparator());
                for (Person person : value) {
                    System.out.println("\t" + person.toString());
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }


    }
}
