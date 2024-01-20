package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersInInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        System.out.println(primeNumberInInterval(n, m));
    }

    private static boolean isPrime(int number) {
        int cycleEnd = (int) Math.sqrt(number);
        boolean result = true;
        for (int i = 2; i <= cycleEnd; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static List<Integer> primeNumberInInterval(int begin, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }

}