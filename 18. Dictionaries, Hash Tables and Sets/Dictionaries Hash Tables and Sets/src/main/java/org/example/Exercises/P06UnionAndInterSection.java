package org.example.Exercises;
import java.util.ArrayList;
import java.util.List;

public class P06UnionAndInterSection {
    private static final long ONE = 1L;
    private static final long TWO = 2L;

    public static void main(String[] args) {
        List<Long> first = new ArrayList<>();
        fillFirstList(first);

        List<Long> second = new ArrayList<>();
        fillSecondList(second);


        List<Long> third = new ArrayList<>();
        fillThirdList(third);

        System.out.println(first);
        System.out.println(third);
        System.out.println(union(first, third));
        System.out.println(intersect(first, third));
    }

    private static void fillThirdList(List<Long> third) {
        third.add(TWO);
        long current = 2 * TWO - 1;

        while (current <= 10000) {
            third.add(current);
            current = 2 * current - 1;
        }
    }


    private static void fillSecondList(List<Long> second) {
        second.add(TWO);
        long current = 3 * TWO + 1;

        while (current <= 10000) {
            second.add(current);
            current = 3 * current + 1;
        }
    }

    private static void fillFirstList(List<Long> first) {
        first.add(ONE);
        long current = 2 * ONE + 3;

        while (current <= 10000) {
            first.add(current);
            current = 2 * current + 3;
        }
    }

    private static List<Long> union(List<Long> first, List<Long> second) {
        List<Long> union = new ArrayList<>(first);
        union.removeAll(second);
        union.addAll(second);
        return union;
    }

    private static List<Long> intersect(List<Long> first, List<Long> second) {
        List<Long> result = new ArrayList<>(first);
        result.retainAll(second);
        return result;
    }
}
