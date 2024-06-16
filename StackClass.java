// public class StackClass {
//     //Stack Linked List implementation
//     static class Node {

//         int data;       //Represent node in linked list
//         Node next;
//         public Node (int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack {
//         public  static Node head;
//         public static boolean isEmpty() {
//             return head == null;
//         }
//         //Push Function
//         public static void push(int data) {
//             Node newNode = new Node(data);
//             if(isEmpty()){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         //pop Fumction
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         //Peek Function
//         public static int peek(){
//             if(isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

//ArrayList Impplementation

// import java.util.ArrayList;
// import java.util.*;

// public class StackClass {
//     static class Stack {
//         static ArrayList<Integer> list = new ArrayList<>();

//         public static boolean isEmpty() {
//             return list.size() == 0;
//         }

//         // Push
//         public static void push(int data) {
//             list.add(data);
//         }

//         // POP
//         public static int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         // Peek
//         public static int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return list.get(list.size() - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// //Java collection framework
// import java.util.*;

// public class StackClass {
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

//Push at bottom
// import java.util.*;
// public class StackClass {
//     public static void pushAtBottom(int data, Stack<Integer> s) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(data, s);
//         s.push(top);
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
        
//         pushAtBottom(4, s);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


//Reverse Stack
import java.util.*;
class StackClass{
    public static void pushAtBottom (int data, Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void reverse (Stack<Integer>s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}