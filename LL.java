//Basic

// public class LL {
//     Node head;
//     private int size;
    
//     LL() {
//         size = 0;
//     }

//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//             size++;
//         } 
//     }

//     // add - first, last
//     // add first pos
//     public void addFirst(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     // add Last pos
//     public void addLast(String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node currNode = head;
//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }

//     // print
//     public void printList() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node currNode = head;
//         while (currNode != null) {
//             System.out.print(currNode.data + "=> ");
//             currNode = currNode.next;
//         }
//         System.out.println("Null");
//     }

//     //DeleteFirst
//     public void deleteFirst() {
//         if(head == null) {
//             System.out.println("The list is empty");
//             return;
//         }
//         head = head.next;
//         size--;
//     }

//     //Delete last
//     public void deleteLast() {
//         if(head == null) {
//             System.out.println("The list is empty");
//             return;
//         }
//         size--;

//         if(head.next == null) {
//             head = null;
//             return;
//         }

//         Node secLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next != null) {
//             lastNode = lastNode.next;
//             secLast = secLast.next;
//         }
//         secLast.next = null;
//     }

//     //size
//     public int getSize() {
//         return size;
//     }

//     public static void main(String[] args) {
//         LL list = new LL();
//         list.addFirst("a");
//         list.addFirst("is");
//         list.printList();

//         list.addLast("list");
//         list.printList();
        
//         list.addFirst("This");
//         list.printList();

//         list.deleteFirst();
//         list.printList();

//         list.deleteLast();
//         list.printList();

//         System.out.println(list.getSize());
//     }
// }




//Linked list using collection framework
import java.util.*;

class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("Null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);


    }
}