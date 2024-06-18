// import java.util.*;
// public class HMapCode {
//     static class HashMap<K,V> {//generics key type nahi pata
//         private class Node {//Defining node of LL
//             K key;
//             V value;

//             public Node(K key, V value) {
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n; //total node
//         private int N;//Buckets
//         private LinkedList<Node>buckets[];  //hashmap

//         @SuppressWarnings("unchecked")

//         public HashMap() { //Constructor of hashmap
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for(int i =0; i<4; i++) {
//                 this.buckets[i] = new LinkedList<>(); //har index p khaali LL
//             }
//         }

//         private void rehash() {
//             LinkedList<Node> oldBucket[] = buckets;  //all busckets stored in old buckets
//             buckets = new LinkedList[n*2]; //empty bucket

//             for(int i =0 ;i<N*2; i++) {//creating empty linked list
//                 buckets[i] = new LinkedList<>();
//             }

//             for(int i = 0; i < oldBucket.length ; i++) {
//                 LinkedList<Node> ll = oldBucket[i];
//                 for(int j =0 ; j<ll.size(); j++) {
//                     Node node = ll.get(j);
//                     put(node.key, node.value);
//                 }
//             }
//         }

//         private int hashFunction(K key) { // bucket index should be 0 to n-1
//             int bi = key.hashCode();
//             return Math.abs(bi) % N;
//         }

//         private int searchInLL(K key, int bi) {
//             LinkedList<Node> ll = buckets[bi];
//             int di = 0;
//             for(int i = 0; i<ll.size(); i++) {
//                 if (ll.get(i).key.equals(key)) {
//                     return i; // di
//                 }
//             }
//             return -1;//key doesnt exist
//         }
//         //Put function
//         public void put (K key, V value) {
//             int bi = hashFunction(key); //convert key to bucket index
//             int di = searchInLL(key, bi); //check if key exist on bucket index
//             if(di == -1) { //doesnt exist
//                 buckets[bi].add (new Node(key, value));
//                 n++;
//             } else {  //key exist
//                 Node data = buckets[bi].get(di);
//                 data.value = value;
//             }
//             double lambada = (double)n/N;
//             if(lambada > 2.0) {
//                 //rehashing
//                 rehash();
//             }
//         }

//         //contains
//         public boolean containKey(K key) {
//             int bi = hashFunction(key); //convert key to bucket index
//             int di = searchInLL(key, bi); //check if key exist on bucket index
//             if(di == -1) { //doesnt exist
//                 return false;
//             } else {  //key exist
//                 return true;
//             }
//         }

//         //REMOVE
//         public V remove(K key) {
//             int bi = hashFunction(key); //convert key to bucket index
//             int di = searchInLL(key, bi); //check if key exist on bucket index
//             if(di == -1) { //doesnt exist
//                 return null;
//             } else {  //key exist
//                 Node node = buckets[bi].remove(di);
//                 n--;
//                 return node.value;
//             }
//         }

//         //get
//         public V get(K key) {
//             int bi = hashFunction(key); //convert key to bucket index
//             int di = searchInLL(key, bi); //check if key exist on bucket index
//             if(di == -1) { //doesnt exist
//                 return null;
//             } else {  //key exist
//                 Node data = buckets[bi].get(di);
//                 return data.value;
//             }
//         }

//         //Keyset
//         public ArrayList<K> Keyset() {
//             ArrayList<K> keyS = new ArrayList<>();
//             for(int i =0 ; i<buckets.length; i++) {//bi
//                 LinkedList<Node> ll = buckets[i];
//                 for(int j =0 ;j<ll.size(); j++) {//di
//                     Node node = ll.get(j);
//                     keyS.add(node.key);
//                 }
//             }
//             return keyS;
//         }

//         //isempty
//         public boolean isEmpty() {
//             return n == 0;
//         }

//         public static void main(String[] args) {
//             HashMap<String, Integer> map = new HashMap<>();
//             map.put("India", 190);
//             map.put("China", 200);
//             map.put("US",50);

//             ArrayList<String> keys = map.Keyset();
//             for(int i = 0; i<keys.size(); i++) {
//                 System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
//             }
//         }

//     }
// }

import java.util.*;

public class HMapCode {
    static class HashMap<K, V> { // generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - nodes
        private int N; // N - buckets
        private LinkedList<Node> buckets[]; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; // di
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                buckets[bi].add(new Node(key, value));
                n++;
            } else { // key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                return false;
            } else { // key exists
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) { // bi
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) { // di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);
        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}