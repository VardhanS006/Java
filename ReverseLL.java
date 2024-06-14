public class ReverseLL {
    Node head;
    private int size;
    
    ReverseLL() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        } 
    }

    // add - first, last
    // add first pos
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add Last pos
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "=> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //DeleteFirst
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    //Delete last
    public void deleteLast() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;

        if(head.next == null) {
            head = null;
            return;
        }

        Node secLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }

    //size
    public int getSize() {
        return size;
    }

    //Reverseiterate
    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

                //update
                prevNode = currNode;
                currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();
        list.reverseIterate();
        list.printList();
    }
}




