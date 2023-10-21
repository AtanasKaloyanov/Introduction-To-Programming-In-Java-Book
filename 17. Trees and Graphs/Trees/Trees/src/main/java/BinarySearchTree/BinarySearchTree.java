package BinarySearchTree;

import BinaryTree.BinaryTree;

public class BinarySearchTree<T extends Comparable<T>> {

    private static class BinaryTreeNode<T extends Comparable<T>>
            implements Comparable<BinaryTreeNode<T>> {
        T value;
        BinaryTreeNode<T> parent;
        BinaryTreeNode<T> leftChild;
        BinaryTreeNode<T> rightChild;

        public BinaryTreeNode(T value) {
            this.value = value;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }

        @Override
        public String toString() {
            return this.value.toString();
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            BinaryTreeNode<T> other = (BinaryTreeNode<T>) obj;
            return this.compareTo(other) == 0;
        }


        public int compareTo(BinaryTreeNode<T> other) {
            return this.value.compareTo(other.value);
        }
    }

    private BinaryTreeNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    private void insert(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Cannot insert an element with null value");
        }

        this.root = insert(value, null, this.root);
    }

    private BinaryTreeNode<T> insert(T value, BinaryTreeNode<T> parentNode, BinaryTreeNode<T> node) {
        if (node == null) {
            this.root = node;
            node = new BinaryTreeNode<T>(value);
            node.parent = parentNode;
        } else {
            int compareNumber = this.root.compareTo(node);
            if (compareNumber < 0) {
                node.leftChild = insert(value, node, node.leftChild);
            } else if (compareNumber > 0) {
                node.rightChild = insert(value, node, node.rightChild);
            }
        }

        return node;
    }
}