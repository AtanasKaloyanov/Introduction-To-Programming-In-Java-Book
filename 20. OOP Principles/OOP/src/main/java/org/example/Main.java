package org.example;

import org.example.Inheritance.Cats.AfricanLion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AfricanLion africanLion = new AfricanLion(true, 100);
        System.out.println(africanLion);

        List<AfricanLion> lions = new ArrayList<>();
    }
}