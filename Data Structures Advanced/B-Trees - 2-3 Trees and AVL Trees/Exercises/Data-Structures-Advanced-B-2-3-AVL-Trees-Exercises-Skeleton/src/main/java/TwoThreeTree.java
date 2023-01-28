public class TwoThreeTree<K extends Comparable<K>> {
    private TreeNode<K> root;

    public static class TreeNode<K> {
        private K leftKey;
        private K rightKey;

        private TreeNode<K> leftChild;
        private TreeNode<K> middleChild;
        private TreeNode<K> rightChild;

        private TreeNode(K key) {
            this.leftKey = key;
        }

        private TreeNode(K root, K leftValue, K rightValue) {
            this(root);
            this.leftChild = new TreeNode<>(leftValue);
            this.rightChild = new TreeNode<>(rightValue);
        }

        private TreeNode(K root, TreeNode<K> left, TreeNode<K> right) {
            this.leftKey = root;

            this.leftChild = left;
            this.rightChild = right;
        }

        boolean isThreeNode() {
            return rightKey != null;
        }

        boolean isTwoNode() {
            return rightKey == null;
        }

        boolean isLeaf() {
            return this.leftChild == null && this.middleChild == null && this.rightChild == null;
        }
    }

    public void insert(K key) {
        if (this.root == null) {
            this.root = new TreeNode<>(key);
            return;
        }

        TreeNode<K> newRoot = this.insert(this.root, key);

        if (newRoot != null) {
            this.root = newRoot;
        }
    }

    private TreeNode<K> insert(TreeNode<K> node, K key) {
        if (node.isLeaf()) {
            if (node.isTwoNode()) {
                if (node.leftKey.compareTo(key) < 0) {
                    node.rightKey = key;
                } else {
                    node.rightKey = node.leftKey;
                    node.leftKey = key;
                }

                return null;
            }
            K left = node.leftKey;
            K middle = key;
            K right = node.rightKey;
            if (key.compareTo(node.leftKey) < 0) {
                left = key;
                middle = node.leftKey;
            } else if (key.compareTo(node.rightKey) > 0) {
                middle = node.rightKey;
                right = key;
            }

            return new TreeNode<>(middle, left, right);
        }

        TreeNode<K> toFix = null;
        if (node.leftKey.compareTo(key) > 0) {
            toFix = insert(node.leftChild, key);
        } else if (node.isTwoNode() && node.leftKey.compareTo(key) < 0) {
            toFix = insert(node.rightChild, key);
        } else if (node.isThreeNode() && node.rightKey.compareTo(key) < 0) {
            toFix = insert(node.rightChild, key);
        } else {
            toFix = insert(node.middleChild, key);
        }

        if (toFix == null) return null;

        if (node.isTwoNode()) {
            if (toFix.leftKey.compareTo(node.leftKey) < 0) {
                node.rightKey = node.leftKey;
                node.leftKey = toFix.leftKey;

                node.leftChild = toFix.leftChild;
                node.middleChild = toFix.rightChild;
            } else {
                node.rightKey = toFix.leftKey;

                node.middleChild = toFix.leftChild;
                node.rightChild = toFix.rightChild;
            }

            return null;
        }

        K promoteValue = null;
        TreeNode<K> left = null;
        TreeNode<K> right = null;

        if (toFix.leftKey.compareTo(node.leftKey) < 0) {
            promoteValue = node.leftKey;
            left = toFix;
            right = new TreeNode<>(node.rightKey, node.middleChild, node.rightChild);
        } else if (toFix.leftKey.compareTo(node.rightKey) > 0) {
            promoteValue = node.rightKey;
            left = new TreeNode<>(node.leftKey, node.leftChild, node.middleChild);
            right = toFix;
        } else {
            promoteValue = toFix.leftKey;
            left = new TreeNode<>(node.leftKey, node.leftChild, toFix.leftChild);
            right = new TreeNode<>(node.rightKey, toFix.rightChild, node.rightChild);
        }

        return new TreeNode<>(promoteValue, left, right);
    }

    public String getAsString() {
        StringBuilder out = new StringBuilder();
        recursivePrint(this.root, out);
        return out.toString().trim();
    }

    private void recursivePrint(TreeNode<K> node, StringBuilder out) {
        if (node == null) {
            return;
        }
        if (node.leftKey != null) {
            out.append(node.leftKey)
                    .append(" ");
        }
        if (node.rightKey != null) {
            out.append(node.rightKey).append(System.lineSeparator());
        } else {
            out.append(System.lineSeparator());
        }
        if (node.isTwoNode()) {
            recursivePrint(node.leftChild, out);
            recursivePrint(node.rightChild, out);
        } else if (node.isThreeNode()) {
            recursivePrint(node.leftChild, out);
            recursivePrint(node.middleChild, out);
            recursivePrint(node.rightChild, out);
        }
    }
}
