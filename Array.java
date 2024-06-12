import java.util.*;

public class Array {
    // public static void main(String[] args) {
    // int [] marks = new int [20];
    // marks[0] = 97;//english
    // marks[1] = 98;//hindi
    // marks[2] = 99;
    // // System.err.println(marks);
    // // System.out.println(marks[0]);
    // for(int i =0; i <3 ; i++) {
    // System.out.println(marks[i]);
    // }
    // // }
    // public static void main(String[] args) {
    // Scanner sc= new Scanner(System.in);
    // int size = sc.nextInt();
    // int numbers[] = new int[size];

    // //input
    // for(int i = 0; i <size; i++) {
    // numbers[i] = sc.nextInt();
    // }
    // //output
    // for(int i =0; i < size; i++) {
    // System.out.println(numbers[i]);
    // }
    // }

    // take a array as input from user search for a given numberx and print the
    // index at x which it occurs
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("What do you want to search");
        int search = sc.nextInt();

        // Check
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Found at index " + i);
            }
        }
    }
}
