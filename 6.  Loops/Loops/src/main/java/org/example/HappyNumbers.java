package org.example;

import java.util.ArrayList;
import java.util.List;

public class HappyNumbers {
    private static List<Integer> happyNumbers() {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        if ((i + j) == (k + l)) {
                            String current = String.valueOf(i) + j + k + l;
                            int currentNumber = Integer.parseInt(current);
                            result.add(currentNumber);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(happyNumbers());
    }
}
