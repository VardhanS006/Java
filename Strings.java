import java.util.*;

public class Strings {
public static void main(String[] args) {
        // String Decleration
        // String name = "Tony"
        // String fullName = "Tony Stark";
        // String sentence = "I Am Iron Man";
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is "+name);

        // Concatenation
        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName+" "+lastName;
        // System.out.println(fullName); //fullname
        // System.out.println(fullName.length());//length;

        // //charAt
        // for(int i =0; i<fullName.length(); i++) {
        // System.out.print(fullName.charAt(i));
        // }

        // Compare String
        // String name1 = "Hello";
        // String name2 = "world";
        // //1>2 :+ve val
        // //1==2 : 0
        // //1<2 : -ve val
        // if(name1.compareTo(name2) == 0){
        // System.out.println("Strings are equal");
        // } else{
        // System.out.println("Not EquL");
        // }

        // //sUBSTRING
        // String sentence = "My name is Tony";
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);
        // }

        // // String Builder
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // System.out.println(sb.charAt(0));// char at 0

        // sb.setCharAt(0, 'p');// replace
        // System.out.println(sb);

        // sb.insert(0, 's');// insert
        // System.out.println(sb);

        // sb.delete(0, 2);// delete
        // System.out.println(sb);

        // sb.append("h");
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);

        //Reverse String;
        StringBuilder sb = new StringBuilder("hello");

        for(int i = 0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
