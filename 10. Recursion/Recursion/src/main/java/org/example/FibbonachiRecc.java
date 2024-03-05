package org.example;

public class FibbonachiRecc {
    public static void main(String[] args) {
        System.out.println(getFibbonachi(9));
    }

    // position in the sequence -    1 2 3 4 5 6 7  8  9  10
    // number                   -    1 1 2 3 5 8 13 21 34 55
    public static int getFibbonachi(int n) {
        if (n <= 2) {
            return 1;
        }

        return getFibbonachi(n - 1) + getFibbonachi(n - 2);
    }

}