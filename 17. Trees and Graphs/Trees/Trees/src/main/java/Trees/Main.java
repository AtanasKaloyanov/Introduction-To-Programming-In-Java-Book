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

//      recc(theTreeInFrontOfMyBlock.getRoot(), "  ");
        theTreeInFrontOfMyBlock.printDFS();

    }

    private static void recc(Tree.TreeNode node, String s) {
        if (node == null) {
            return;
        }

        System.out.println(s + node.getValue());

        for (int i = 0; i < node.getChildrenCount(); i++) {
            recc(node.getChild(i), s + "  ");
        }
    }

}
       /*
       7
         19
             1
             12
             31
         21
         14
             23
             6
        */


//                     7

//     19              21              14

// 1   12  31                      23       6