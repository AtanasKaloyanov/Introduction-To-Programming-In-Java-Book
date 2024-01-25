package org.example.P04TenCats;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayMyao() {
        System.out.println("I am " + getName() + "!");
    }
}
