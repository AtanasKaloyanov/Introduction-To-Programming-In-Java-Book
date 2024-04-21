package org.example.Exercise.T05Firm2;

import org.example.Exercise.T05Firm2.Properties.Property;

import java.util.List;
import java.util.Set;

public class Company {
    private String name;
    private String owner;
    private String bulstat;
    private Set<Employee> employees;
    private List<Property> properties;

    public Company(String name, String owner, String bulstat, Set<Employee> employees, List<Property> properties) {
        this.name = name;
        this.owner = owner;
        this.bulstat = bulstat;
        this.employees = employees;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Company: " + this.name + " | Owner: " + this.owner + " | Bulstat: " + this.bulstat + "\n\nEmployees:" + this.employees.toString().replaceAll("[\\[\\],]", "") + "\n\nProperties:" + this.properties.toString().replaceAll("[\\[\\],]", "");
    }
}
