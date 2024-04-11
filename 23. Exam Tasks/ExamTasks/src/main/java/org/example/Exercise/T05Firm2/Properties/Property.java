package org.example.Exercise.T05Firm2.Properties;

public abstract class Property {
    private double area;
    private double pricePerMeter;
    private String coordinates;

    public Property(double area, double pricePerMeter, String coordinates) {
        this.area = area;
        this.pricePerMeter = pricePerMeter;
        this.coordinates = coordinates;
    }
    public double getArea() {
        return area;
    }

    public double getPricePerMeter() {
        return pricePerMeter;
    }

    public String getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "\n   " + getClass().getSimpleName() + " | Area: " + this.area + " | Meter Price: " + this.pricePerMeter + " | Coordinates: " + this.coordinates;
    }
}
