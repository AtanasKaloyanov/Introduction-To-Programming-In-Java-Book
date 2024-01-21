package org.example;
import java.util.Scanner;



public class P03LexiArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] array1 = readArray(scanner);
        char[] array2 = readArray(scanner);

        lexiCompare(array1, array2);
    }

    private static char[] readArray(Scanner scanner) {
        return scanner.nextLine().replaceAll(", ", "").toCharArray();
    }

    private static int lexiNumber(char[] array1, char[] array2) {
        String first = new String(array1);
        String second = new String(array2);
        return first.compareTo(second);
    }

    private static void lexiCompare(char[] array1, char[] array2) {
        int comparator = lexiNumber(array1, array2);
        if (comparator == 0) {
            System.out.println("The arrays are lexicographically equal");
        } else if (comparator > 1) {
            System.out.println(new String(array1));
        } else {
            System.out.println(new String(array2));
        }
    }
}
