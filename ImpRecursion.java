import java.util.ArrayList;

public class ImpRecursion {
    // //print all permutation of string
    //Time complexity = O(n!)
    // public static void printPermutation( String str, String Permutation) {
    //     if(str.length() == 0) {
    //         System.out.println(Permutation);
    //         return;
    //     }
    //     for(int i =0; i< str.length(); i++) {
    //         char currChar = str.charAt(i);
    //         //if "abc" => bc
    //         String newStr = str.substring(0, i) + str.substring(i+1);
    //         printPermutation(newStr, Permutation + currChar);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     printPermutation(str, "");
    // }

    // //Count total path in a maze to move from (0,0) to (n,m)  ==>(n,m) = (3,3)
    // //cond => move only right direction or downward direction
    // public static int countPaths(int i , int j, int n, int m) {
    //     if(i == n || j == m) {
    //         return 0; //no paths i.e. boundary
    //     }
    //     if(i ==n-1 && j == m-1) {
    //         return 1;//we have paths
    //     }

    //     //move down
    //     int downPaths = countPaths(i+1, j, n, m);
    //     //move right
    //     int rightPaths = countPaths(i, j+1, n, m);
        
    //     return downPaths+rightPaths; //returns total

    // }
    // public static void main(String[] args) {
    //     int n =3, m =3;
    //     int totalpaths = countPaths(0, 0, n, m);
    //     System.out.println(totalpaths);
    // }

    // //Place tiles of size 1xm in floor size of nxm (n=4,m=2)
    // public static int placeTiles(int n ,int m) {
    //     if(n == m) {
    //         return 2;
    //     }
    //     if(n < m) {
    //         return 1;
    //     }
    //     //vertical
    //     int verticalPlacement = placeTiles(n-m, m);
    //     //horizontal
    //     int horizontalPlacement = placeTiles(n-1, m);
    //     return verticalPlacement+horizontalPlacement;
    // }
    // public static void main(String[] args) {
    //     int n = 4, m =2;
    //     int sol = placeTiles(n, m);
    //     System.out.println(sol);
    // }

    //Find the number of ways in which you can invite n people to your party, single or in pairs (n = 4)
    // public static int callGuest(int n) {
    //     if(n<=1) {
    //         return 1;
    //     }
    //     //single
    //     int ways1 = callGuest(n-1);
    //     //pairs
    //     int ways2 = (n-1) * callGuest(n-2);
    //     return ways1 + ways2;
    // }
    // public static void main(String[] args) {
    //     int n = 4;
    //     System.out.println(callGuest(n));
    // }


    //Print all the subsets of a set of first n natural numbers(n = 3)  => {1,2,3}
    //Time complexity = O(2^n)
    public static void printSubset(ArrayList<Integer>subset) {
        for(int i =0; i<subset.size();i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer>subset) {
        if(n==0) {
            System.out.println(subset);
            return;
        }
        //add subset
        subset.add(n);
        findSubset(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
  }
