package org.example;

public class FindingIndecesSequence {

    public static void main(String[] args) {
        String input = "The main subject in the \\\"Intro Java\\\"\" +\n" +
                "\" book is Java for Java newbies.";

        int index = input.indexOf("Java");

        while (index != -1) {
            System.out.println(index);
            index = input.indexOf("Java", index + 1);
        }
    }
}
