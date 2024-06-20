//Majority element

// import java.util.*;
// public class HashingImpQues {
//     public static void majorityElement(int nums[]) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n = nums.length;
//         for(int i =0 ; i<n ;i++) {
//             if(map.containsKey(nums[i])) {
//                 //true
//                 map.put(nums[i], map.get(nums[i]) + 1);
//         } else {
//             map.put(nums[i], 1);
//         }
//     }
//     for(int key : map.keySet()) {
//         if(map.get(key) > n/3) {
//             System.out.println(key);
//         }
//     }
// }
//     public static void main(String[] args) {
//         int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//         majorityElement(nums);
//     }
// }



// union of two array and return size
// TimeComplexity = O(n)
// import java.util.*;
// public class HashingImpQues {
//     public static int union(int arr1[], int arr2[]) {
//         HashSet<Integer> sol = new HashSet<>();
//         for(int i = 0; i<arr1.length; i++) {
//             sol.add(arr1[i]);
//         }
//         for(int j =0; j<arr2.length; j++) {
//             sol.add(arr2[j]);
//         }
//         return sol.size();
//     }
//     public static void main(String[] args) {
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};
//         System.out.println(union(arr1, arr2));
//     }
// }

//Intersection
// import java.util.*;
// public class HashingImpQues {
//     public static int intersection(int arr1[], int arr2[]) {
//         HashSet<Integer> sol = new HashSet<>();
//         int count = 0;
//         for(int i = 0; i< arr1.length; i++) {
//             sol.add(arr1[i]);
//         }
//         for(int j = 0; j<arr2.length;j++) {
//             if(sol.contains(arr2[j])) {
//                 count++;
//                 sol.remove(arr2[j]);
//         }
//         } 
//         return count;
//     }
//     public static void main(String[] args) {
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};
//         System.out.println(intersection(arr1, arr2));
//     }
// }



//itinerary
// import java.util.*;
// public class HashingImpQues {
//     //1
//     public static String getStart(HashMap<String, String> tick) {
//         HashMap <String, String> revMAp = new HashMap<>();

//         for(String key : tick.keySet())  {
//             //key -> key : val - > tick.get(key)
//             revMAp.put(tick.get(key), key); //Key ko value aur value ko key
//         }

//         for(String key : tick.keySet()) {
//             if(!revMAp.containsKey(key)) {
//                 return key;//starting point
//             }
//         }
//         return null;
//     }
// public static void main(String[] args) {
//     HashMap<String, String> tickets = new HashMap<>();
//     tickets.put("Chennai", "Bengaluru");
//     tickets.put("Mumbai", "Delhi");
//     tickets.put("Goa", "Chennai");
//     tickets.put("Delhi", "Goa");
//     String start = getStart(tickets);

//     while(tickets.containsKey(start)) {
//         System.out.print(start +"=>");
//         start = tickets.get(start);
//     }
//     System.out.println(start);
// }
// }

