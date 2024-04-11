package org.example.Exercise.T05Firm2;

public class Employee {
    private String name;
    private String position;
    private int workMonths;

    public Employee(String name, String position, int workMonths) {
        this.name = name;
        this.position = position;
        this.workMonths = workMonths;
    }

    @Override
    public String toString() {
        return "\n" + "   Employee: " + this.name + " | Position: " + this.position + " | Work Months: " + this.workMonths;
    }
}
