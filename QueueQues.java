//Implement Queue using two stacks
import java.util.*;
public class QueueQues {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //add
        public static void add(int data) {
            while(!s1.empty()) {
                s2.push(s1.pop()); //s1 se pop kar k s2 m push kia
            }
            s1.push(data);
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return s1.pop();
        }

        //Peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return s1.peek();
        }
    }
   
    public static void main(String[] args) {

            // Queue<Integer> q = new LinkedList<>();
            Queue q = new Queue();
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
     