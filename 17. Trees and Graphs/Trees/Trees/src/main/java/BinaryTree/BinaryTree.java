package BinaryTree;

public class BinaryTree<T> {
    public static class BinaryTreeNode<T> {
        private T value;
        private boolean hasPerant;
        private BinaryTreeNode<T> leftChild;
        private BinaryTreeNode<T> rightChild;

        public BinaryTreeNode(T value, BinaryTreeNode<T> leftChild, BinaryTreeNode<T> rightChild) {
            if (value == null) {
                throw new IllegalArgumentException("Cannot insert null value");
            }
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public BinaryTreeNode(T value) {
            this(value, null, null);
        }

        public T getValue() {
            return this.value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public BinaryTreeNode<T> getLeftChild() {
            return this.leftChild;
        }

        public void setLeftChild(BinaryTreeNode<T> leftChild) {
            if (leftChild == null || leftChild.hasPerant) {
                throw new IllegalArgumentException();
            }

            this.leftChild = leftChild;
            leftChild.hasPerant = true;
        }

        public BinaryTreeNode<T> getRightChild() {
            return this.rightChild;
        }

        public void setRightChild(BinaryTreeNode<T> rightChild) {
            if (rightChild == value || rightChild.hasPerant) {
                throw new IllegalArgumentException();
            }

            this.rightChild = rightChild;
            rightChild.hasPerant = true;
        }

    }

    private BinaryTreeNode<T> root;

    public BinaryTree(T value, BinaryTree<T> leftChild, BinaryTree<T> rightChild) {
        BinaryTreeNode<T> left = leftChild != null ? leftChild.root : null;
        BinaryTreeNode<T> right = rightChild != null ? rightChild.root : null;

        this.root = new BinaryTreeNode<T>(value, left, right);
    }

    public BinaryTree(T value) {
        this(value, null, null);
    }

    public BinaryTreeNode<T> getRoot() {
        return this.root;
    }

    public BinaryTreeNode<T> getLeftNode() {
        if (this.root == null) {
            return null;
        }

        return this.root.leftChild;
    }

    public BinaryTreeNode<T> getRightNode() {
        if (this.root == null) {
            return null;
        }

        return this.root.rightChild;
    }

    public void preOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }

        preOrder(root.getLeftChild());
        System.out.print(root.value + " ");
        preOrder(root.getRightChild());
    }

    public void inOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        inOrder(root.getLeftChild());
        inOrder(root.getRightChild());
    }

    public void postOrder(BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }

        postOrder(root.getLeftChild());
        postOrder(root.getRightChild());
        System.out.print(root.value + " ");
    }

}
