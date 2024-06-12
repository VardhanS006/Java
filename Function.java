import java.util.*;

// public class Function {
//     public static void printMyName(String name) {
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);
//     }

//Make a function to add two numbers and return the sum
// public class Function {
//     public static int CalculateSum(int num1, int num2) {
//         int sum = num1+num2;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = CalculateSum(a, b);
//         System.out.println(sum);
//     }

//Make a function to multiply two numbers and return a product
// public class Function {
//     public static int CalculateProduct(int num1, int num2) {
//         int prod = num1*num2;
//         return prod;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int prod = CalculateProduct(a, b);
//         System.out.println(prod);
//     }

//Factorial
public class Function {
    public static void Factorial(int n) {
        if(n<1){
            System.out.println("Invalid number");
            return;
        }
        int Factorial = 1;
        for (int i = n; i >= 1; i--) {
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);
        return;
    }

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Factorial(a);
    }

}
