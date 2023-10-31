package org.example.AlgorithmsComplexityExamples;

public class Example1 {
    int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // O(N) complexity - linear

    int findInversion(int[] array) {
        int inversion = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    inversion++;
                }
            }
        }
        return inversion;
    }

    // O(N * M) complexity - quadratic

    long sum3(int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sum += (long) i * j * k;
                }
            }
        }
        return sum;
    }

    // O(N^3) complexity - cubic

    public long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // O(n) complexity
    public long reccursiveFibonachi(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return reccursiveFibonachi(n - 1) + reccursiveFibonachi(n - 2);
    }

    // O(2 ^ n) exponential complexity

    public long recursiveFibonachi2(int n) {
        int fnResult = 1;
        int fn1 = 1;
        int fn2 = 1;

        for (int i = 2; i < n; i++) {
            fnResult = fn1 + fn2;
            fn2 = fn1;
            fn1 = fnResult;
        }
        return fnResult;
    }
}
