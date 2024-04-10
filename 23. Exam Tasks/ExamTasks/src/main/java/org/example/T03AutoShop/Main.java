package org.example.T03AutoShop;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("name1", "country1",
                "address1", "phone1", "fax1");
        Car car1 = new Car("brand1", "model1", 2001);
        Car car2 = new Car("brand2", "model2", 2002);
        Car car3 = new Car("brand3", "model3", 2003);
        Car car4 = new Car("brand4", "model4", 2004);
        List<Car> cars1 = new ArrayList<>(List.of(car1, car2, car3, car4));

        Part part1 = new Part("code1", "name1", Category.UNDERCARRIAGE, 101, 201, cars1, manufacturer1);

        Manufacturer manufacturer2 = new Manufacturer("name2", "country2",
                "address2", "phone2", "fax2");
        List<Car> cars2 = new ArrayList<>(List.of(car1, car2));
        Part part2 = new Part("code2", "name2", Category.TIRES, 102, 202, cars2, manufacturer2);

        Set<Part> parts = new LinkedHashSet<>(Set.of(part1, part2));
        Shop shop = new Shop(parts);

        for (Part part : shop.getParts()) {
            System.out.println(part);
            System.out.println();
        }

    }
}

/*

class Shop

1. List<Part>

class Part

1. String code
2. String name
3. Category category
4. double buyingPrice
5. double sellingPrice
6. List<Car> cars
7. Manufacturer manufacturer

enum Cetegory

UNDERCARRIAGE, TIRES, ENGINE, ACCESSORY

class Car

1. String brand
2. String model
3. int year

class Munufacturer

1. String name
2. String country
3. String address
4. String phone
5. String fax
 */

