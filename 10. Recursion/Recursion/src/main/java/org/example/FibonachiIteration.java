package org.example;

import java.util.Scanner;

public class FibonachiIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = Integer.parseInt(scanner.nextLine());

        long result = fibonachiIter(position);
        System.out.println(result);
    }

    private static long fibonachiIter(int position) {
        long prePrevious = 1;
        long previous = 1;

        long result = 1;

        for (int i = 2; i < position; i++) {
            result = prePrevious + previous;
            prePrevious = previous;
            previous = result;
        }

        return result;
    }

}

//0 1 2 3 4 5 6  7   8   9    10
//0 1 1 2 3 5 8  13  21  34   55
