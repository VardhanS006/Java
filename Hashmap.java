import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("india", 120);
        map.put("US",30);
        map.put("China", 140);
        System.out.println(map);
        map.put("China", 180);      //update
        System.out.println(map);


        //Search operation
        // 1. whether key in map
        if(map.containsKey("China")) {
            System.out.println("Present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }
        //2.getfunction for value for key
        System.out.println(map.get("China"));//exist
        System.out.println(map.get("indonasia"));//doesnt exist


        //Iterate
        // int arr[] = {12, 15, 18};
        // for(int i = 0; i< 3; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int val : arr) {
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        for(Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue());
            System.out.println();
        }
    }
}
