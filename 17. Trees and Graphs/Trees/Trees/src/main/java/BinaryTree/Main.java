package BinaryTree;

public class Main {
    public static void main(String[] args) {
        // BinaryTree implementation
        BinaryTree<Integer> root = new BinaryTree<Integer>(10,
                new BinaryTree<Integer>(1,
                        new BinaryTree<Integer>(23),
                        new BinaryTree<Integer>(20)),
                new BinaryTree<Integer>(20,
                        new BinaryTree<Integer>(37),
                        new BinaryTree<Integer>(100))
        );

        preOrder(root.getRoot());
        System.out.println();
        inOrder(root.getRoot());
        System.out.println();
        postOrder(root.getRoot());
        System.out.println();

        root.preOrder(root.getRoot());
        System.out.println();
        root.inOrder(root.getRoot());
        System.out.println();
        root.postOrder(root.getRoot());
        System.out.println();


        //                     10

        //           1                    20

        //      23      20           37        100

    }
// pre-order = left, root, right

    // 23 1 20 10 20 37 100
    public static void preOrder(BinaryTree.BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        preOrder(root.getLeftChild());
        System.out.print(root.getValue() + " ");
        preOrder(root.getRightChild());
    }

    // in-order = root, left, right
    // 10 1 23 20 20 37 100
    public static void inOrder(BinaryTree.BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getValue() + " ");
        inOrder(root.getLeftChild());
        inOrder(root.getRightChild());
    }
    // post-order = left, right, root
    // 23 20 1 37 100 20 10

    public static void postOrder(BinaryTree.BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        postOrder(root.getLeftChild());
        postOrder(root.getRightChild());
        System.out.print(root.getValue() + " ");
    }
}

// preOrder
// "23", "19", "10", "6", "21", "14", "3", "15".

// inOrder
//"14", "19", "23", "6", "10", "21", "15", "3".

// postOrder
// "23", "10", "21", "6", "19", "3", "15", "14"
