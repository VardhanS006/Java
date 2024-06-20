//Trie
public class Classroom {
    //1. represent all node
    static class Node {
        Node[] children;
        boolean eow;//end of word

        public Node() {
            children = new Node[26];//in java we have to define size of array
            for(int i =0 ;i <26; i++) {
                children[i] = null; //initialize
            }
            eow = false;
        }
    }

    static Node root = new Node(); //whenever we want to make trie root node will always be there enpty


    public static void insert (String word) {
        Node curr = root; //to fix value of root
        for(int i =0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                //add new node
                curr.children[idx] = new Node();
            }
            if(i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    //Search 
    //Time complexity = O(L) ==>Length of key
    public static boolean search (String key) {
        Node curr =  root;
        for(int i =0 ; i< key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if(node == null) { //children of root does not contain key
                return false;
            }
            if(i == key.length() - 1 && node.eow == false) {
                return false;
            }
            curr = curr.children[idx];  
        }
        return true;
    }

    //Word break problem
    public static boolean wordbreak (String key) {
        if(key.length() == 0) {
            return true;
        }
        for(int i =1; i<= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordbreak(secondPart)) {
                return true;
            }
        }
        return false;
    }

    /*Starts with problem
     * creates a function boolean startswith(String prefix) for a trie.
     * Returns true id there is  apreviously inserted String word that has the prefix prefix and false otherwise
     * this is similar to search but not to worry about eow
    */
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for ( int i =0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    //Count unique substring
    public static int countNode(Node root) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        for (int i =0; i<26; i++) {
            if(root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        // String words[] = {"the", "a", "there", "their", "any"};
        // for(int i =0 ; i <words.length; i++) {
        //     insert(words[i]);
        // }
        // System.out.println(search("there"));
        // System.out.println(search("for"));
        // System.out.println(search("an"));


        // problem 1 Word break problem
        // String words[] = {"i", "like", "samsung", "mobile"};
        // String key = "ilikesamsung"; 

        // for(int i =0;i < words.length; i++) {
        //     insert(words[i]);
        // }
        // System.out.println(wordbreak(key));


        //Starts with problem
        // String words[] = {"apple", "app", "mango", "man", "woman"};
        // String prefix = "moon";
        // for(int i =0 ;i <words.length; i++) {
        //     insert(words[i]);
        // }
        // System.out.println(startsWith(prefix));

        //Count unique substring
        String str = "ababa";
        for(int i =0; i<str.length();i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));
    }
}
