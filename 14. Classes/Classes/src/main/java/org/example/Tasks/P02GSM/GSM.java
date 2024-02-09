package org.example.Tasks.P02GSM;

import java.util.ArrayList;
import java.util.List;

public class GSM {
    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    private Battery battery;
    private static final String nokiaN95 = "nokiaN95";

    private List<Call> calls = new ArrayList<>();

    public GSM(String model, String manufacturer, double price, String owner, Battery battery) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public static String getNokiaN95() {
        return GSM.nokiaN95;
    }

    public void addCall(Call call) {
        this.calls.add(call);
    }

    public void removeCall(Call call) {
        this.calls.remove(call);
    }

    public void removeAllCalls() {
        this.calls = new ArrayList<>();
    }
    public int getArchiveCalls() {
        return this.calls.size();
    }
    public double callsSum(double moneyPerCall) {
        return this.getArchiveCalls() * moneyPerCall;
    }
}
