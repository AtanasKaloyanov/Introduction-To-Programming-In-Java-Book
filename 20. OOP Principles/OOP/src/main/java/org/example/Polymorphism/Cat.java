package org.example.Polymorphism;

public abstract class Cat {
    public abstract String getSound();
    public  void catchPray() {
        System.out.println("I run fast");
    }

    @Override
    public String toString() {
        return String.format("I say \"" + getSound() + "\"");
    }
}
