package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P14MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt((element) -> Integer.parseInt(element))
                .toArray();

        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int leftSubArrayLength = arrayLength / 2;
        int rightSubArrayLength = arrayLength - leftSubArrayLength;
        int[] leftSubArray = new int[leftSubArrayLength];
        int[] rightSubArray = new int[rightSubArrayLength];

        for (int i = 0; i < leftSubArrayLength; i++) {
            leftSubArray[i] = array[i];
        }
        for (int i = leftSubArrayLength; i < arrayLength; i++) {
            rightSubArray[i - leftSubArrayLength] = array[i];
        }
        mergeSort(leftSubArray, leftSubArrayLength);
        mergeSort(rightSubArray, rightSubArrayLength);

        merge(array, leftSubArray, rightSubArray, leftSubArrayLength, rightSubArrayLength);
    }

    public static void merge(
            int[] array, int[] leftSubArray, int[] rightSubArray, int leftSubArrayLength, int rightSubArrayLength) {

        int leftArrayIndex = 0, rightArrayIndex = 0, arrayIndex = 0;
        while (leftArrayIndex < leftSubArrayLength && rightArrayIndex < rightSubArrayLength) {
            if (leftSubArray[leftArrayIndex] <= rightSubArray[rightArrayIndex]) {
                array[arrayIndex++] = leftSubArray[leftArrayIndex++];
            } else {
                array[arrayIndex++] = rightSubArray[rightArrayIndex++];
            }
        }
        while (leftArrayIndex < leftSubArrayLength) {
            array[arrayIndex++] = leftSubArray[leftArrayIndex++];
        }
        while (rightArrayIndex < rightSubArrayLength) {
            array[arrayIndex++] = rightSubArray[rightArrayIndex++];
        }
    }

}
