package org.example;

public class AnonymousClass {
    public static void main(String[] args) {
        new Object() {
            void printer(String value) {
                System.out.println(value);
            }
        }.printer("a");
        
    }
}
