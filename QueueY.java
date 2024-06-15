// //Array
// import java.util.*;
// public class QueueY {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear = -1;

//         Queue(int n) {
//             arr = new int[n];
//             this.size = n;
//         }

//         public static boolean isEmpty() {
//             return rear == -1;
//         }

//         //Add enque
//         public static void add(int data) {
//             if(rear == size-1) {
//                 System.out.println("Full Queue");
//                 return;
//             }
//             rear ++;
//             arr[rear] = data;
//         }

//         //deque remove
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Empty Queue");
//             }
//             int front = arr[0];
//             for(int i =0; i< rear; i++) {
//                 arr[i] = arr[i+1];
//             }
//             rear--;
//             return front;
//         }
//         //Peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Qmpty Queue");
//             }
//             return arr[0];
//         }

//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//             while(! q.isEmpty()) {
//                 System.out.println(q.peek());
//                 q.remove();
//             }

//     }
// }

// //Circular Queue
// public class QueueY {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear = -1;
//         static int front =-1;

//         Queue(int n) {
//             arr = new int[n];
//             this.size = n;
//         }

//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         public static boolean isFull(){
//             return (rear + 1) % size == front;
//         }

//         //enque
//         public static void add(int data) {
//             if (isFull()) {
//                 System.out.println("Full Queue");
//                 return;
//             }
//             // add front element
//             if (front == -1) {
//                 front = 0;
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         //remove

//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1; 
//             }
//             int result = arr[front];
//             if (rear == front) {
//                 rear = front = -1;
//             } else {
//                 front = (front + 1) % size;
//             }
//             return result;
//         }

//         //Peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         System.out.println(q.remove());
//         q.add(6);;
//         System.out.println(q.remove());
//         q.add(7);

//             while(! q.isEmpty()) {
//                 System.out.println(q.peek());
//                 q.remove();
//             }

//     }
// }

// //Linked list Implementation
// import java.util.*;
// public class QueueY {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         //enque
//         public static void add(int data) {
//            Node newNode = new Node(data);
//            if(tail == null) {
//             tail = head = newNode;
//             return;
//            }
//            tail.next = newNode;
//            tail = newNode;
//         }

//         //remove

//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1; 
//             }
//             int front = head.data;
//             if(head == tail) {
//                 head = tail = null;
//             }else {
//                 head = head.next; 
//             }
//             return front;
//         }

//         //Peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//             while(! q.isEmpty()) {
//                 System.out.println(q.peek());
//                 q.remove();
//             }

//     }
// }

//Java collection framework
import java.util.*;

public class QueueY {
    public static void main(String[] args) {

       // Queue<Integer> q = new LinkedList<>();
       Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
