package org.example.Inheritance.Cats;

import org.example.Inheritance.Cats.Felidae;

public class Lion extends Felidae {
    private int weight;

    public Lion(boolean male, int weight) {
        super(male);
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
