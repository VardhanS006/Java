import java.util.*;
import java.math.*;

public class Exercise {
    // public static float Avg(int a, int b, int c) {
    // int average = (a + b + c) / 3;
    // return average;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

    // float sol = Avg(a, b, c);
    // System.out.println("Average of numbers "+a+" " +b+" "+c+"=" +sol);
    // }

    // sum of all odd numbers from 1 to n
    // public static int oddCheck(int num) {
    // for(int i = 0; i <= num ;i++){
    // if(i % 2 != 0) {
    // System.out.println(i);
    // }
    // else{
    // continue;
    // }
    // }
    // return 0;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // oddCheck(n);

    // }

    // Write a function which takes in 2 numbers and returns the greater of those
    // two.
    // public static void greaterCheck(int a, int b) {
    // int num1 = a;
    // int num2 = b;
    // if(num1 > num2) {
    // System.out.println(num1 +"is greater than"+ num2);
    // }else {
    // System.out.println(num2 +"is greater than "+num1);
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // greaterCheck(a,b);
    // }

    // Write a function that takes in the radius as input and returns the
    // circumference of a circle.
    // public static void calculateCircumference (int n){
    // int rad = n;
    // float circumference = (float) (2*3.14*rad);
    // System.out.println("Circumference of circle with radius " + rad + " is " +
    // circumference);
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner (System.in);
    // int rad = sc.nextInt();
    // calculateCircumference(rad);

    // }

    // Write a function that takes in age as input and returns if that person is
    // eligible to vote or not. A person of age > 18 is eligible to vote.
    // public static void checkVote(int age) {
    // if (age >= 18) {
    // System.out.println("Eligible");
    // } else {
    // System.out.println("Not Eligible");
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // checkVote(num);
    // }

    // Write an infinite loop using do while condition.
    // public static void main(String[] args) {
    // do{
    // System.out.println("Hello");
    // } while(true);
    // }

    // Write a program to enter the numbers till the user wants and at the end it
    // should display the count of positive, negative and zeros entered.
    // public static void main(String[] args) {
    // System.out.println("Enter a number");
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();

    // int positive = 0;
    // int negative = 0;
    // int zero = 0;

    // if (num > 0) {
    // positive++;
    // } else if (num < 0) {
    // negative++;
    // } else {
    // zero++;
    // }
    // System.out.println("Number of positive numbers "+positive);
    // System.out.println("Number of negative numbers "+negative);
    // System.out.println("Number of zeroes "+zero);
    // }

    // Two numbers are entered by the user, x and n. Write a function to find the
    // value of one number raised to the power of another i.e. xn
    // public static double power(int x, int y) {
    // return Math.pow(x, y);
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    // int y = sc.nextInt();
    // double sol = power(x, y);
    // System.out.println(sol);
    // }
    // Write a function that calculates the Greatest Common Divisor of 2 numbers.
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int m = sc.nextInt();
    // int gcd = 1;
    // for(int i =1; i<=n && i<=m;i++) {
    // if(n % i == 0 && m % i == 0) {
    // gcd = i;
    // }
    // }
    // System.out.println(gcd);
    // }

    // Write a program to print Fibonacci series of n terms where n is input by user
    // :
    // 0 1 1 2 3 5 8 13 21 .....
    // In the Fibonacci series, a number is the sum of the previous 2 numbers that
    // came before it.
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series of " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}