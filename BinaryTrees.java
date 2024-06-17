// Build tree preorder
// public class BinaryTrees {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;

//         public static Node buildTree(int nodes[]) {
//             idx++; //root created
//             if (nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
//             return newNode;
//         }
//     }

//     public static void main(String[] args) {
//         int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         System.out.println(root.data);
//     }
// }

// Traversal
//time complexity = O(n)
import java.util.*;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        // Finding Root Node
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++; // root created
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // Preorder Traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    // Inorder Traversal
    // time complexity = O(n)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    // postorder traversal
    // time complexity = O(n)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    // Level Order Traversal
    // Timecomplexity = O(n)

    public static void level(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data);
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // Count of nodes
    // Time Complexity = O(n)
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    // Sum of Nodes
    // Time complexity = O(n)
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    // Height of Tree
    // Time complexity = O(n)
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftRight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftRight, rightHeight) + 1;
        return myHeight;
    }

    // Diameter of tree=> number if nodes in the longest path between 2 nodes
    // Approach 1: O(n^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3, Math.max(diam2, diam1));
    }
    // Approach 2 O(n)

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("Preorder");
        preorder(root);

        System.out.println("Inorder");
        inorder(root);

        System.out.println("Postorder");
        postorder(root);

        System.out.println("Level order");
        level(root);

        System.out.println("Count of nodes");
        System.out.println(countOfNodes(root));

        System.out.println("Sum of nodes");
        System.out.println(sumOfNodes(root));

        System.out.println("Height of tree");
        System.out.println(height(root));

        System.out.println("Max Diameter");
        System.out.println(diameter(root));
    }
}
