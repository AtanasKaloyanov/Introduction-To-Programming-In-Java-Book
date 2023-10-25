package BinarySearchTree;


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
            throw new IllegalArgumentException("Cannot insret null value");
        }

        this.root = insert(value, null, this.root);
    }

    private BinaryTreeNode<T> insert(T value, BinaryTreeNode<T> parent, BinaryTreeNode<T> node) {
        if (node == null) {
            node = new BinaryTreeNode<T>(value);
            node.parent = parent;
        } else {
            int compareNumber = value.compareTo(node.value);

            if (compareNumber < 0) {
                node.leftChild = insert(value, node, node.leftChild);
            } else if (compareNumber > 0) {
                node.rightChild = insert(value, node, node.rightChild);
            }
        }

        return node;
    }

    private BinaryTreeNode<T> find(T value) {
        BinaryTreeNode<T> node = this.root;

        while (node != null) {
            int compareNumber = value.compareTo(node.value);

            if (compareNumber < 0) {
                node = node.leftChild;
            } else if (compareNumber > 0) {
                node = node.rightChild;
            } else {
                break;
            }

        }

        return node;
    }

    public void remove(T value) {
        // finding the element
        BinaryTreeNode<T> nodeToDelete = find(value);
        if (nodeToDelete == null) {
            return;
        }

        remove(nodeToDelete);
    }

    private void remove(BinaryTreeNode<T> node) {
        // 3. if the element has 2 subtrees (leftChild and rightChild) => we find the smallest element in the right
// subtree and then swapping. Then the element should be removed.
        if (node.leftChild != null && node.rightChild != null) {
            BinaryTreeNode<T> replacement = node.rightChild;
            while (replacement.leftChild != null) {
                replacement = replacement.leftChild;
            }

            node.value = replacement.value;
            node = replacement;
        }


        BinaryTreeNode<T> theChild = node.leftChild != null ? node.leftChild : node.rightChild;

        if (theChild != null) {
            theChild.parent = node.parent;

            if (node.parent == null) {
                root = theChild;
            } else {
                if (node.parent.leftChild == node) {
                    node.parent.leftChild = theChild;
                } else {
                    node.parent.rightChild = theChild;
                }
            }
        } else {
            if (node.parent == null) {
                root = null;
            } else {
                if (node.parent.leftChild == node) {
                    node.parent.leftChild = null;
                } else {
                    node.parent.rightChild = null;
                }
            }
        }
    }
}


// removing

// 2. if the element is a leaf => its parent's reference (leftChild or rightChild) becomes null
// 3. if the element has only one subtree (leftChild or rightChild) => swapping the element with this subtree



