package org.example;

import java.util.*;

public class P13BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt((element) -> Integer.parseInt(element))
                .toArray();

        Arrays.sort(array);

        int searchedElement = Integer.parseInt(scanner.nextLine());
        int searchedIndex = binarySearched(array, searchedElement);
        if (searchedIndex == -1) {
            System.out.println("The element is not in the array.");
        } else {
            System.out.printf("The element is on index %d.", searchedIndex);
        }
    }

    private static int binarySearched(int[] array, int searchedElement) {
        int serchedIndex = -1;
        int lowestIndex = 0;
        int highestIndex = array.length - 1;
        
        while (lowestIndex <= highestIndex) {
            int middleIndex = lowestIndex + (highestIndex - lowestIndex) / 2;
            int middleElement = array[middleIndex];

            if (searchedElement < middleElement) {
                highestIndex = middleIndex - 1;
            } else if (searchedElement > middleElement) {
                lowestIndex = middleIndex + 1;
            } else if (searchedElement == middleElement) {
                serchedIndex = middleIndex;
                break;
            }
        }

        return serchedIndex;
    }
}


