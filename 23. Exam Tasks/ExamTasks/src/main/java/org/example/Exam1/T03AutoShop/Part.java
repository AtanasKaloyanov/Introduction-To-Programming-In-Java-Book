package org.example.T03AutoShop;
import java.util.List;

public class Part {
    private String code;
    private String name;
    private Category category;
    private double buyingPrice;
    private double sellingPrice;
    private List<Car> cars;
    private Manufacturer manufacturer;

    public Part(String code, String name, Category category,
                double buyingPrice, double sellingPrice, List<Car> cars,
                Manufacturer manufacturer) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.cars = cars;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Code: ").append(this.code).append(System.lineSeparator());
        sb.append("Name: ").append(this.name).append(System.lineSeparator());
        sb.append("Category: ").append(this.category).append(System.lineSeparator());
        sb.append("Buying price: ").append(this.buyingPrice).append(System.lineSeparator());
        sb.append("Selling price: ").append(this.sellingPrice).append(System.lineSeparator());
        sb.append("Cars: ").append(this.cars.toString().replaceAll("[\\[\\]]", "").replaceAll(", ", "")).append(System.lineSeparator());
        sb.append("Manufacturer: ").append(this.manufacturer);
        return sb.toString();
    }
}
