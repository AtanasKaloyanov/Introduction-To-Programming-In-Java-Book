package org.example.Encapsulation;

public class Lion extends Felidae {
    private int weight;

    public Lion(boolean male, int wight) {
        super(male);
        // super.male = male The field male from the superclass Felidae is invisible
        this.weight = wight;
    }

}
