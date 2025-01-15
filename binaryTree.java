public class Main {
    static class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    Node root;

    public Main(int key) {
        root = new Node(key);
    }

    public Main() {
        root = null;
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        Node a = new Node(2);
        tree.root.left = a;
        Node b = new Node(3);
        tree.root.right = b;
        a.left = new Node(4);
        a.right = new Node(5);

        System.out.println("Pre-Order Traversal:");
        tree.printPreorder(tree.root);

        System.out.println("\nIn-Order Traversal:");
        tree.printInorder(tree.root);

        System.out.println("\nPost-Order Traversal:");
        tree.printPostorder(tree.root);

        System.out.println("\nTree Depth (Levels): " + tree.calculateLevel(tree.root));
        System.out.println("Children Sum Property: " + tree.hasChildrenSumProperty(tree.root));

        System.out.println(tree.checkTreeType(tree.root));
    }

    void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    int calculateLevel(Node node) {
        if (node == null) {
            return 0;
        }
        int leftLevel = calculateLevel(node.left);
        int rightLevel = calculateLevel(node.right);
        return 1 + Math.max(leftLevel, rightLevel);
    }

    boolean isTreeFull(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return true;
        }
        if (node.left != null && node.right != null) {
            return isTreeFull(node.left) && isTreeFull(node.right);
        }
        return false;
    }

    String checkTreeType(Node node) {
        if (node == null) {
            return "The tree is both FULL and COMPLETE (empty tree).";
        }
        boolean isFull = isTreeFull(node);
        boolean isComplete = isTreeComplete(node);

        if (isFull && isComplete) {
            return "The tree is both FULL and COMPLETE.";
        } else if (isFull) {
            return "The tree is FULL but not COMPLETE.";
        } else if (isComplete) {
            return "The tree is COMPLETE but not FULL.";
        } else {
            return "The tree is neither FULL nor COMPLETE.";
        }
    }

    boolean hasChildrenSumProperty(Node node) {
        if (node == null || (node.left == null && node.right == null)) {
            return true;
        }
        int leftValue = (node.left != null) ? node.left.key : 0;
        int rightValue = (node.right != null) ? node.right.key : 0;
        if (node.key == leftValue + rightValue && hasChildrenSumProperty(node.left) && hasChildrenSumProperty(node.right)) {
            return true;
        }
        return false;
    }

    int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    boolean isTreeComplete(Node node) {
        int totalNodes = countNodes(node);
        return isTreeCompleteHelper(node, 0, totalNodes);
    }

    boolean isTreeCompleteHelper(Node node, int index, int totalNodes) {
        if (node == null) {
            return true;
        }
        if (index >= totalNodes) {
            return false;
        }
        return isTreeCompleteHelper(node.left, 2 * index + 1, totalNodes) && isTreeCompleteHelper(node.right, 2 * index + 2, totalNodes);
    }
}
