package org.example.Exercise.T04Firm1;

import java.util.Set;

public class Company {
    private String name;
    private String address;
    private String owner;
    private Set<Performer> performers;

    public Company(String name, String address, String owner, Set<Performer> performers) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.performers = performers;
    }



    @Override
    public String toString() {
        return "Name: " + this.name + " | Address: " + this.address + " | Owner: " + this.owner + " | Performers: " + this.performers.toString().replaceAll("[\\[\\],]", "");
    }
}

// 1. String name
//2. String address
//3. String owner
//4. Set<Performer> performers
