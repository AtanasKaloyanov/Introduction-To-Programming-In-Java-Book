package Trees;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> theTreeInFrontOfMyBlock =
                new Tree<>(7,
                        new Tree(19,
                                new Tree(1),
                                new Tree(12),
                                new Tree(31)),
                        new Tree(21),
                        new Tree(14,
                                new Tree(23),
                                new Tree(6))
                );

        theTreeInFrontOfMyBlock.printDFS();
    }
}

//                     7

//     19              21              14

// 1   12  31                      23       6