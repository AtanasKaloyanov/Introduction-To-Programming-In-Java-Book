package org.example.Exam2.Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02ErastosthenesSieve {
    private static boolean[] composites;
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        primeCounter(n);
        System.out.println(numbers);
    }

    private static void primeCounter(int n) {
        if (n <= 2) {
            throw new IllegalArgumentException();
        }
        composites = new boolean[n];
        int square = (int) Math.sqrt(n);

        for (int i = 2; i <= square; i++) {
            if (!composites[i]) {
                for (int j = i * i; j < n; j += i) {
                    composites[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            boolean current = composites[i];
            if (!current) {
                numbers.add(i);
            }
        }
    }


}
