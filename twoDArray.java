import java.util.*;

public class twoDArray {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int columns = sc.nextInt();
       
//        int [][]arr = new int [rows][columns];

//        //input
//        for(int i =0 ;i < rows ;i++) {
//         for(int j= 0;j<columns; j++){
//             arr[i][j] = sc.nextInt();
//         }
//        }
//        //output
//        for(int i =0; i<rows;i ++) {
//         for(int j =0;j<columns;j++) {
//             System.out.print(arr[i][j] );
//         }
//         System.out.println();
//        }
//     }

//take a matrix as input from the user and search for the given number x and print the index where it appears
public static void main(Strings[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int [][]arr = new int [rows][cols];

    //input
    for(int i = 0; i < rows ; i++) {
        for(int j =0; j < cols ; j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    //search
    System.err.println("What are you looking for");
    int search = sc.nextInt();

    //output
    for(int i=0; i<rows; i++) {
        for(int j = 0; j<cols; j++) {
            if(arr[i][j] == search) {
                System.out.println("Found at " +i+" , "+j);
            }
        }
    }
}
}
