package org.example;

import java.util.Arrays;

public class P01TwentyElementsArray {
    public static void main(String[] args) {
        int[] array = arrayCreater();
        System.out.println(Arrays.toString(array));
    }
    private static int[] arrayCreater() {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        return array;
    }
}
