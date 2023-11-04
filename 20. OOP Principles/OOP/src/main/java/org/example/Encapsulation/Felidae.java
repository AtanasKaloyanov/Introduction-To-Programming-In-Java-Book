package org.example.Encapsulation;

public abstract class Felidae {
    private boolean male;

    public Felidae() {
        this(true);
    }

    public Felidae(boolean male) {
        this.male = male;
    }

    public void a() {
        System.out.println("a!");
    }
}
