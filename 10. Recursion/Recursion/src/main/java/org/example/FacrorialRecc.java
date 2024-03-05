package org.example;

import java.util.Scanner;

public class FacrorialRecc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givernNumber = Integer.parseInt(scanner.nextLine());

        int result = factorialRecc(givernNumber);
        System.out.println(result);
    }

    private static int factorialRecc(int givernNumber) {
        if (givernNumber == 0 || givernNumber == 1) {
            return 1;
        }

        return givernNumber * factorialRecc(givernNumber - 1);
    }


    // number                    1 2 3 4   5    6
    // reccursion of the number  1 2 6 24 120  720

    // recursion(n) = n * reccursion(n - 1)


}
