package org.example;

public class P04Cards {
    public static void main(String[] args) {

        for (int i = 2; i <= 14; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i <= 10) {
                    System.out.print(i + "-");
                    printColor(j);
                } else if (i == 11) {
                    System.out.print("J-");
                    printColor(j);
                } else if (i == 12) {
                    System.out.print("Q-");
                    printColor(j);
                } else if (i == 13) {
                    System.out.print("K-");
                    printColor(j);
                } else {
                    System.out.print("A-");
                    printColor(j);
                }
            }
        }
    }
    private static void printColor(int j) {
        if (j == 1) {
            System.out.println("Spade");
        } else if (j == 2) {
            System.out.println("Heart");
        } else if (j == 3) {
            System.out.println("Diamond");
        } else {
            System.out.println("Club");
        }
    }
}
