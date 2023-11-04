package org.example.Polymorphism;

public class DomesticCat extends Cat{
    @Override
    public String getSound() {
        return "Myau!";
    }

    @Override
    public void catchPray() {
        super.catchPray();
    }
}
