package org.example.T03AutoShop;

import java.util.Set;

public class Shop {
    private Set<Part> parts;
    public Shop(Set<Part> parts) {
        this.parts = parts;
    }

    public Set<Part> getParts() {
        return this.parts;
    }
}
