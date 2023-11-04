package org.example.Abstraction;

public class AfricanLion extends AbstractLion {



    @Override
    public Lion[] reproduce(Lion mate) {
        return new Lion[0];
    }

    @Override
    public void catchPray() {
        System.out.println("A");
    }
}
