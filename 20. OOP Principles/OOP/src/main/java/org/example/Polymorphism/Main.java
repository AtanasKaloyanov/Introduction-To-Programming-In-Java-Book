package org.example.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Cat tiger = new Tiger();
        Cat domesticCat = new DomesticCat();

        System.out.println(tiger);
        System.out.println(domesticCat);

        tiger.catchPray();
        domesticCat.catchPray();
    }
}