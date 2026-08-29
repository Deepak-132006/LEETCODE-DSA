package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void reverse() {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }
        head = prev;
    }
}

public class ReverseLL {
    Node newNode = new Node(10);
}
