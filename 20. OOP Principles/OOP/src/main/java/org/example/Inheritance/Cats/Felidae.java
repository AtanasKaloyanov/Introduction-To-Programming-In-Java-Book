package org.example.Inheritance.Cats;

public class Felidae { // Latin word for Cat
    private boolean male;
    public Felidae() {
        this(true);
    }

    public Felidae(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return this.male;
    }

    public void setMail(boolean male) {
        this.male = male;
    }

}
