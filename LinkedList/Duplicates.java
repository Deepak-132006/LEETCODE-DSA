package Linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Duplicates {
    public Node removeDuplicates(Node head) {

        if (head == null) {
            return head;
        }

        Node curr = head;

        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    void printList(Node current) {

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(10);
        Node third = new Node(20);
        Node fourth = new Node(20);
        Node fifth = new Node(30);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        Node head = first;

        System.out.println(new Duplicates().removeDuplicates(head).data);
        new Duplicates().printList(head);
    }
}
