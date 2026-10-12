package Linkedlist;

import java.util.HashMap;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedLst {
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
    
    void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

public class Reverse {
    public static void main(String[] args) {
        LinkedLst list = new LinkedLst();

        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        list.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Before");
        list.printList();

        list.reverse();

        System.out.println("After");
        list.printList();
    }
}
