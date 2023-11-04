package org.example.Abstraction;

import org.example.Encapsulation.Felidae;

public class Lion extends Felidae implements Reproducible {
    private int weight;

    public Lion(boolean male, int wight) {
        super(male);
        // super.male = male The field male from the superclass Felidae is invisible
        this.weight = wight;
    }

    @Override
    public Lion[] reproduce(Lion mate) {
        return new Lion[]{new Lion(true, 100), new Lion(false, 80)};
    }
}
