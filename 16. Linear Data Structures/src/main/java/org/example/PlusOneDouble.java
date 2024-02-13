package org.example;
import java.util.*;

public class PlusOneDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.add(firstNumber);
        result.add(firstNumber);

        for (int i = 0; i < times; i++) {
            int currentElement = queue.peek();
            int nextElement = currentElement + 1;
            int nextElement2 = currentElement * 2;
            queue.add(nextElement);
            queue.add(nextElement2);
            result.add(nextElement);
            result.add(nextElement2);
            queue.poll();
        }

        System.out.println(result);
    }
}