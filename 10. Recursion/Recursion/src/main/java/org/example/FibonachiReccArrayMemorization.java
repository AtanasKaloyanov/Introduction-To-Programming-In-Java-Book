package org.example;

import java.util.Scanner;

public class FibonachiReccArrayMemorization {
    private static long[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = Integer.parseInt(scanner.nextLine());
        array = new long[position + 2];
        array[1] = 1;
        array[2] = 1;

        long result = fibMemor(position);
        System.out.println(result);
    }
    private static long fibMemor(int positionInTheSequence) {
        if (array[positionInTheSequence] == 0) {
           array[positionInTheSequence] = fibMemor(positionInTheSequence - 1) + fibMemor(positionInTheSequence - 2);
        }

        return array[positionInTheSequence];
    }
}

// position in the sequence - 1 2 3 4 5 6 7   8   9    10
// number in the sequence   - 1 1 2 3 5 8 13  21  34   55
