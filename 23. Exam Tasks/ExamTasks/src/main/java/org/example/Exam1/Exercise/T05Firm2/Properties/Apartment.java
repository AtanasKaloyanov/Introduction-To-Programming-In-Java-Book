package org.example.Exercise.T05Firm2.Properties;

public class Apartment extends Property {
    private int stageNumber;
    private boolean hasElevator;
    private boolean hasFurniture;
    public Apartment(double area, double pricePerMeter, String coordinates,
                     int stageNumber, boolean hasElevator, boolean hasFurniture) {
        super(area, pricePerMeter, coordinates);
        this.stageNumber = stageNumber;
        this.hasElevator = hasElevator;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString() {
        return "\n   " + getClass().getSimpleName() + " | Area: " + super.getArea() + " | Price per perimeter: " + super.getPricePerMeter() + " | Coordinates: " + super.getCoordinates()
                + " | Stage number: " + this.stageNumber + " | Elevator: " + this.hasElevator + " | Furniture: " + this.hasFurniture;
    }
}
