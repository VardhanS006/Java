public class Recursion {
    // Print numbers from 1 to 5

    // public static void printNumbers(int n) {
    // if(n==0) {
    // return;
    // }
    // System.out.println(n);
    // printNumbers(n-1);
    // }
    // public static void main(String[] args) {
    // int n =5;
    // printNumbers(n);
    // }

    // Print numbers from 1 to 5
    // public static void printNumbers(int n) {
    // if(n==6) {
    // return;
    // }
    // System.out.println(n);
    // printNumbers(n+1);
    // }
    // public static void main(String[] args) {
    // int n = 1;
    // printNumbers(n);
    // }

    // print sum of first n natural numbers
    // public static void printSum(int i, int n, int sum) {
    // if(i==n) {
    // sum+=i;
    // System.out.println(sum);
    // return;
    // }
    // sum+=i;
    // printSum(i+1, n, sum);
    // }
    // public static void main(String[] args) {
    // printSum(1, 5, 0);
    // }

    // print factorial of a number n
    // public static int calcFactorial(int n) {
    // if(n==1||n==0) {
    // return 1;
    // }
    // int fact_nm1 = calcFactorial(n-1);
    // int fact_n = n*fact_nm1;
    // return fact_n;
    // }
    // public static void main(String[] args) {
    // int n =5;
    // int ans = calcFactorial(n);
    // System.out.println(ans);
    // }

    // fabonacci series till nth term
    // public static void printfib(int a , int b, int n) {//a is second last and b
    // is last term
    // if(n==0) {
    // return;
    // }
    // int c = a+b;
    // System.out.println(c);
    // printfib(b, c, n-1);
    // }
    // public static void main(String[] args) {
    // int a =0;
    // int b=1;
    // System.out.println(a);
    // System.out.println(b);
    // int n =7;
    // printfib(a, b, n-2);
    // }

    // print x^n(stack height = n)
    // public static int calcPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 1) {
    // return 0;
    // }

    // int xpownm1 = calcPower(x, n - 1);
    // int xpown = x * xpownm1;
    // return xpown;
    // }

    // public static void main(String[] args) {
    // int x = 2, n = 5;
    // int ans = calcPower(x, n);
    // System.out.println(ans);
    // }

    // print x^n(stack height = nlogn)
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);

    }
}