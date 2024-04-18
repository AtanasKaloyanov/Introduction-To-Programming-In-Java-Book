package org.example.Exam2.T02PrimeNumbersMatrix;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static Queue<Integer> primeNumbers = new ArrayDeque<>();

    public static void main(String[] args) {
        // 1. Reading the input and initialising the matrix
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        scanner.close();

        // 2. Finding input * input prime numbers and adding them into a list
        int numbersCount = input * input;
        int currentNumber = 2;
        primeNumbersAdding(numbersCount, currentNumber);

        // 3. Printing the matrix
        matrixPrinting(input);
    }

    private static void matrixPrinting(int input) {
        for (int row = 0; row < input; row++) {
            for (int column = 0; column < input; column++) {
                int current = primeNumbers.remove();
                System.out.print(current + " ");
            }
            System.out.println();
        }
    }

    private static void primeNumbersAdding(int numbersCount, int currentNumber) {
        while (true) {
            if (primeNumbers.size() == numbersCount) {
                break;
            }

           if  (isPrime(currentNumber)) {
               primeNumbers.add(currentNumber);
           }

            currentNumber++;
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
