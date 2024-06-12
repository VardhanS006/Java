import java.util.*;

public class Conditions {
    public static void main(Strings[] args) {
        // Conditional statement
        // Question- take input of user age if age>18 adult or not adult
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age > 18)
        // {
        // System.out.println("Adult");
        // }
        // else{
        // System.out.println("Not Adult");
        // }

        // Question- take user input check if it is odd or even
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // if(a % 2 ==0)
        // {
        // System.out.println("Even");
        // }
        // else{
        // System.out.println("Odd");
        // }

        // Question- take two number from user if a=b print equal ifa>b print a is
        // greater ifa<b print a is less
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a == b) {
        // System.out.println("A is equal");
        // } else if (a < b) {
        // System.out.println("A is less");
        // } else {
        // System.out.println("A is greater");
        // }

        // Question Greeting 1=hello 2=namaste 3=Bonjour
        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // if(button == 1) {
        // System.out.println("Hello");
        // } else if(button == 2) {
        // System.out.println("Namaste");
        // }else if(button == 3) {
        // System.out.println("Bonjour");
        // }
        // else{
        // System.out.println("Invalid Button");
        // }

        // Switch
        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // switch (button) {
        // case 1:
        // System.out.println("Hello");
        // break;
        // case 2:
        // System.out.println("Namaste");
        // break;
        // case 3:
        // System.out.println("Bonjour");
        // break;
        // default:
        // System.out.println("Invalid");
        // break;
        // }

        // Calculator
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 1 to add\n2 to subtract\n3to multiply\n4 t0 divide");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;

            default:
                break;
        }
    }
}
