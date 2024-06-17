import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    //insertion
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Search
    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data > key) {
            return search(root.left, key);
        }

        else if(root.data == key) {
            return true;
        }

        else {
            return search(root.right, key);
        }
    }

    // //Delete
    // =>No child
    // =>one child
    // =>Two child
    public static Node delete(Node root, int val) {
        if(root.data > val) {
            root.left = delete(root.left, val);
        }
        else if(root.data < val) {
            root.right =  delete(root.right, val);
        } 
        else{
            // root.data == val
            //case-1(leaf node)
            if(root.left == null && root.right == null) {
                return null;
            }
            //Case 2 1 child
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            //Case 3 2 child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            delete(root.right, IS.data);
            return root.right;
        }
        return root;
    }
    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    //Print in range
    public static void printInRange(Node root, int X, int Y) {
        if(root == null) {
            return ;
        }
        //c1
        if(root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.println(root.data+" ");
            printInRange(root.right, X, Y);
        }
        //case2
        else if(root.data >= Y) {
            printInRange(root.left, X, Y);
        }
        //c3
         else{
            printInRange(root.right, X, Y);
         }
    }

    //Root to leaf path
    public static void printPath( ArrayList<Integer>path) {
        for(int i =0; i <path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer>path) {
        if(root == null) {
            return;
        }

        path.add(root.data);
        //leaf
        if(root.left == null && root.right == null) {
            printPath(path);
        } else{
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);
        }
    }
    
    public static void main(String[] args) {
            //traversal
        // int values[] = { 5, 1, 3, 4, 2, 7 };
        // Node root = null;
        // for (int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }
        // inorder(root);
        // System.out.println();

        //search
        // int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        // Node root = null;

        // for(int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }
        // inorder(root);
        // System.out.println();

        // if(search(root, 7)) {
        //     System.out.println("Found");
        // }
        // else {
        //     System.out.println("Not Found");
        // }

        // Delete
        // int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        // Node root = null;

        // for(int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }
        // inorder(root);
        // System.out.println();
        // delete(root, 4);
        // inorder(root);;

        //Print in range
        // int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        // Node root = null;

        // for(int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }
        // inorder(root);
        // System.out.println();
        
        // printInRange(root, 3, 12);


        //Root to leaf path
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        
        printRootToLeaf(root, new ArrayList<>());
    }
}
