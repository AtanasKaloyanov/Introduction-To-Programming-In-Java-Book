package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P14MergeSortWithLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map((element) -> Integer.parseInt(element))
                .collect(Collectors.toList());

        mergeSort(list);
        System.out.println(list);
    }

    private static void mergeSort(List<Integer> list) {
        int listSize = list.size();
        if (listSize == 1) {
            return;
        }

        int leftListSize = listSize / 2;

        List<Integer> leftList = new ArrayList<>();
        for (int i = 0; i < leftListSize; i++) {
            int currentElemenet = list.get(i);
            leftList.add(currentElemenet);
        }

        List<Integer> rightList = new ArrayList<>();
        for (int i = leftListSize; i < listSize; i++) {
            int currentElemenet = list.get(i);
            rightList.add(currentElemenet);
        }

        mergeSort(leftList);
        mergeSort(rightList);
        divideAndConquere(leftList, rightList, list);
    }
    private static void divideAndConquere(List<Integer> leftList, List<Integer> rightList, List<Integer> list) {
        int leftListIndex = 0, rightListIndex = 0, listIndex = 0;
        while (leftListIndex < leftList.size() && rightListIndex < rightList.size()) {
            int currentLeft = leftList.get(leftListIndex);
            int currentRight = rightList.get(rightListIndex);

            if (currentLeft <= currentRight) {
                list.set(listIndex, currentLeft);
                leftListIndex++;
            } else {
                list.set(listIndex, currentRight);
                rightListIndex++;
            }
            listIndex++;
        }

        while (leftListIndex < leftList.size()) {
            int currentElement = leftList.get(leftListIndex);
            list.set(listIndex, currentElement);
            leftListIndex++;
            listIndex++;
        }

        while (rightListIndex < rightList.size()) {
            int currentElement = rightList.get(rightListIndex);
            list.set(listIndex, currentElement);
            rightListIndex++;
            listIndex++;
        }
    }
}
