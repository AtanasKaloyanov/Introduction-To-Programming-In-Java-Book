package org.example;

import java.util.ArrayList;
import java.util.List;

public class P16EratostensSieve {
    public static void main(String[] args) {
        int end = 10000000;

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 1; i <= end; i++) {
            boolean isPrime = true;
            int squEnd = (int) Math.sqrt(i);
            for (int j = 2; j <= squEnd; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }

        System.out.println(primeNumbers.size());
    }
}
