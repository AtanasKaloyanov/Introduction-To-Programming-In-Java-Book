package org.example.Inheritance.Cats;

public class AfricanLion extends Lion {
    private String name;
    public AfricanLion(boolean male, int weight) {
        super(male, weight);
    }

    @Override
    public String toString() {
        return super.isMale() + " " + super.getWeight();
    }
}
