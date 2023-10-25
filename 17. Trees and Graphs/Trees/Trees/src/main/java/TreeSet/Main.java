package TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(9);

        for (Integer current : treeSet) {
            System.out.print(current + " ");
        }
    }
}
