package org.example.T03AutoShop;

public class Manufacturer {
    private String name;
    private String country;
    private String address;
    private String phone;
    private String fax;

    public Manufacturer(String name, String country, String address,
                        String phone, String fax) {
        this.name = name;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
    }

    @Override
    public String toString() {
        return this.name + " " + this.country + " " + this.address + " " + this.phone + " " + this.fax;
    }
}
