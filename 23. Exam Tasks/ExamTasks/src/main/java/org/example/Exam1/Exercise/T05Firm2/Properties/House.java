package org.example.Exercise.T05Firm2.Properties;

public class House extends Property {
    private double livingPartArea;
    private double yardArea;
    private boolean hasFurniture;

    public House(double area, double pricePerMeter, String coordinates,
                 double livingPartArea, double yardArea, boolean hasFurniture) {
        super(area, pricePerMeter, coordinates);
        this.livingPartArea = livingPartArea;
        this.yardArea = yardArea;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString() {
        return "\n   " + getClass().getSimpleName() + " | Area: " + super.getArea() + " | Price per perimeter: " + super.getPricePerMeter() + " | Coordinates: " + super.getCoordinates()
                + " | Living Part Area: " + this.livingPartArea + " | Yard Area: " + this.yardArea + " | Furniture: " + this.hasFurniture;
    }
}


