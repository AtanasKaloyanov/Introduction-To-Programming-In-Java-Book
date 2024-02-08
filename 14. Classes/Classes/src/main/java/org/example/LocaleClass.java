package org.example;

public class LocaleClass {
    public static void main(String[] args) {
        class Printer {
            private int value = 6;
            public void print() {
                System.out.println(value);
            }
        }

        Printer printer = new Printer();
        printer.print();
    }
}
