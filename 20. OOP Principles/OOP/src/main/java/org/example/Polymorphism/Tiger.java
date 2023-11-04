package org.example.Polymorphism;

public class Tiger extends Cat{
    @Override
    public String getSound() {
        return "RRR";
    }

    @Override
    public void catchPray() {
        super.catchPray();
    }
}
