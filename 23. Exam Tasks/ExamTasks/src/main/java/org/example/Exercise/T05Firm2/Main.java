package org.example.Exercise.T05Firm2;

import org.example.Exercise.T05Firm2.Properties.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("employee1", "position1", 1);
        Employee employee2 = new Employee("employee2", "position2", 2);
        Employee employee3 = new Employee("employee3", "position3", 3);

        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Property shop = new Shop(100, 100, "1-1");
        Property fruitGarden = new UndevelopedLand(200, 200, "2-2");
        Property apartment = new Apartment(300, 300, "3-3", 3, true, true);
        Property house = new House(400, 400, "4-4", 100, 300, true);

        List<Property> properties = new ArrayList<>(List.of(shop, fruitGarden, apartment, house));
        Company company = new Company("company1", "owner1", "bulstat1", employees, properties);

        System.out.println(company);
    }
}

/*
class Company

1. String name
2. String owner
3. String bulstat
4. Set<Employee> employees
5. List<Property> properties

class Employee

1. String name
2. String position
3. int workMonths

class Property

1. double area
2. pricePerMeter
3. String coordinates

class Apartment extends Property

1. int stageNumber
2. boolean hasElevator
3. boolean hasFurniture

class House extends Property

1. double livingPartArea
2. double yardArea
3. boolean hasFurniture

class UndevelopedLand extends Property
class Shop extends Property

 */
