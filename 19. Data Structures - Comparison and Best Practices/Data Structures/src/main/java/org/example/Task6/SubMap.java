package org.example.Task6;
import java.util.SortedMap;
import java.util.TreeMap;

public class SubMap {
    public static void main(String[] args) {
        Product first = new Product("a", 5);
        Product second = new Product("b", 6);
        Product third = new Product("c", 7);
        Product fourth = new Product("d", 11);
        Product fifth = new Product("e", 10);
        Product sixth = new Product("d", 12);

        TreeMap<Double, Product> productsByPrice = new TreeMap<>();
        productsByPrice.put(first.getPrice(), first);
        productsByPrice.put(second.getPrice(), second);
        productsByPrice.put(third.getPrice(), third);
        productsByPrice.put(fourth.getPrice(), fourth);
        productsByPrice.put(fifth.getPrice(), fifth);
        productsByPrice.put(sixth.getPrice(), sixth);

        SortedMap<Double, Product> result = productsByPrice.subMap(5.00, 10.01);
        System.out.println(result);
    }
}
