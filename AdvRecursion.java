import java.util.HashSet;

public class AdvRecursion {
    // //TowerOfHanoi
    //complexity = O(2n-1) = O(2n)
    // public static void towerOfHanoi(int n, String src ,String helper, String dest) {
    //    if(n == 1) {
    //     System.out.println("transfer disk "+ n + " from " +src+ " to "+dest);
    //     return;
    //    }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("transfer disk "+ n + " from " +src+ " to "+dest);
    //     towerOfHanoi(n-1, helper, src, dest );
    // }
    // public static void main(String[] args) {
    //     // Tower of Hanoi
    //     int n = 3 ; //n is number of disk
    //     towerOfHanoi(n, "S", "H", "D");
    // }

    // print a string in reverse
    // Time complexity = O(n)
    // public static void printRev(String str, int index) {
    //     if(index == 0) {
    //         System.out.println(str.charAt(index));
    //         return;
    //     }
    //     System.out.println(str.charAt(index));
    //     printRev(str, index-1);
    // }
    // public static void main(String[] args) {
    //     String str = "abcd";
    //     printRev(str, str.length()-1);
    // }

    //Find the first and last of occurance in a string
    // Time complexity = O(n)
    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurance(String str, int idx, char element) {
    //     if(idx == str.length()) {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == element) {
    //         if(first == -1) {
    //             first = idx;
    //         } else{
    //             last = idx;
    //         }
    //     }
    //     findOccurance(str, idx+1, element);
    // }
    //     public static void main(String[] args) {
    //         String sc = "abaacdaefaah";
    //         findOccurance(sc, 0, 'a');
    //     }



    // //Check if an array is sorted
    // // Time complexity = O(n)
    // public static boolean isSorted( int arr[] , int idx) {
    //     if(idx == arr.length-1) {
    //         return true;
    //     }
    //     if(arr[idx]<arr[idx+1]) {
    //         //array id sorted till now
    //         return isSorted(arr, idx+1);
    //     } else {
    //         return false;
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,3,5};
    //     System.out.println(isSorted(arr, 0));
    // }

    //Move all x to the end of the string
    // //Time complexity = O(2n) => O(n)
    // public static void moveAllX(String str, int idx, int count, String newString) {
    //     if(idx == str.length()) {
    //         for(int i = 0; i <= count; i++) {
    //         newString += "x";
    //     }
    //     System.out.println(newString);
    //     return;
    // }
    //     char currentChar = str.charAt(idx);
    //     if (currentChar == 'x') {
    //         count++;
    //         moveAllX(str, idx+1, count, newString);
    //     } 
    //     else {
    //         newString += currentChar;
    //         moveAllX(str, idx+1, count, newString);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "axbcxxd";
    //     moveAllX(str, 0, 0, " ");
    // }


    // //Remove duplicates from string
    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicates (String str, int idx, String newString) {
    //     if(idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a'] ) {
    //         removeDuplicates(str, idx+1, newString);
    //     } else {
    //         newString += currChar;
    //         map[currChar - 'a'] = true;
    //         removeDuplicates(str, idx+1, newString);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abbccda";
    //     removeDuplicates(str, 0, " ");
    // }

    // //Print  all sub-sequences of the strings   //abc
    // //Time complexity = O(2^n)
    // public static void subSequence(String str, int idx, String newString) {
    //     if(idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);

    //     // to be
    //     subSequence(str, idx+1, newString+currChar);
    //     //or not to be
    //     subSequence(str, idx+1, newString);
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     subSequence(str, 0, " ");
    // }

    // //Pirnt all unique subsequences of String // Hashset
    // public static void subString(String str, int idx, String newString, HashSet<String> set) {
    //     if(idx == str.length()) {
    //         if(set.contains(newString)) {
    //             return;
    //         } else {
    //             System.out.println(newString);
    //             set.add(newString);
    //             return;
    //         }
    //     }
    //     char currChar = str.charAt(idx);
    //     //to add
    //     subString(str, idx+1, newString+currChar, set);
    //     //not adding
    //     subString(str, idx+1, newString, set);
    // }
    // public static void main(String[] args) {
    //     String str = "aaa";
    //     HashSet<String> set = new HashSet<>();
    //     subString(str, 0, "", set);
    // }


    //print keyboard combination
    public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination (String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i<mapping.length(); i++) {
            printCombination(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printCombination(str, 0, "");
    }
    

}