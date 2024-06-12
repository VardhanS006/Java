import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        // getBit
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // if((bitMask & n ) == 0) {
        // System.out.println("Bit was 0");
        // } else {
        // System.out.println("Bit was 1");
        // }

        // //setBit
        // int n = 5;
        // int pos = 1;
        // int bitMap = 1<<pos;
        // int newNumber = bitMap | n;
        // System.out.println(newNumber);

        // Clearbit
        // int n =5;
        // int pos = 2;
        // int bitMap = 1<<pos;
        // int not = ~bitMap;
        // int newNumber = not & n;
        // System.out.println(newNumber);

        // updateBit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // op =1 set else clear
        int n = 5;
        int pos = 1;
        int bitMap = 1 << pos;
        if (oper == 1) {
            int newNumber = bitMap | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMap);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
