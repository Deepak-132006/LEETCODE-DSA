package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class PracticeOne {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println(head.data);
        Node current = head;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
