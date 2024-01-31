package org.example;

public class Main {
    public static void main(String[] args) {
        String first = "Atanas";
        String second = first;
        System.out.println(first);
        System.out.println(second);
        first = "Ivan";
        System.out.println(first);
        System.out.println(second);
    }
}
