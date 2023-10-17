package Trees;

import java.util.ArrayList;

// represents a tree data structure
public class Tree<T> {
    // represents a tree node
    public static class TreeNode<T> {
        // contains the value of the node
        private T value;
        // shows whether the current node has parent
        private boolean hasPerant;
        // contains the children of the node
        private ArrayList<TreeNode<T>> children;

        public TreeNode(T value) {
            if (value == null) {
                throw new IllegalArgumentException("Cannot insert null value!");
            }
            this.value = value;
            this.children = new ArrayList<>();
        }

        // returns the value of the node
        public T getValue() {
            return this.value;
        }

        // sets the value of the node
        public void setValue(T value) {
            this.value = value;
        }

        // adds a child to the node
        public void addChild(TreeNode<T> child) {
            if (child == null) {
                throw new IllegalArgumentException("Cannot insert null value");
            }

            if (child.hasPerant) {
                throw new IllegalArgumentException("This child has already a parent");
            }

            child.hasPerant = true;
            this.children.add(child);
        }

        // gets the child of the node at given index
        public TreeNode<T> getChild(int index) {
            return this.children.get(index);
        }

        // return the children's count
        public int getChildrenCount() {
            return this.children.size();
        }
    }

    // the root of the tree
    private TreeNode<T> root;

    // constructor 1 (only with T value as an argument)
    public Tree(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Cannot insert null value");
        }

        this.root = new TreeNode<>(value);
    }

    // constructor 2  (with T value and a List of children

    public Tree(T value, Tree<T>... children) {
        this(value);

        for (Tree<T> child : children) {
            this.root.addChild(child.root);
        }
    }

    // getter for the root
    public TreeNode<T> getRoot() {
        return this.root;
    }

    // getter for the children
    public ArrayList<TreeNode<T>> getNodeChildren() {
        if (this.root != null) {
            return this.root.children;
        }

        return new ArrayList<>();
    }

    // Depth First Search Approach

    private void printDFS(TreeNode<T> root, String spaces) {
        if (this.root == null) {
            return;
        }

        System.out.println(spaces + root.getValue());

        TreeNode<T> child = null;

        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChild(i);
            printDFS(child, spaces + "  ");
        }
    }

    // DFS calling

    public void printDFS() {
        this.printDFS(this.root, "");
    }
}
