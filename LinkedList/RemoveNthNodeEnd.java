package Linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveNthNodeEnd {
    public Node removeNthFromEnd(Node head, int n) {
        Node temp = new Node(0);
        temp.next = head;

        Node slow = temp;
        Node fast = temp;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return temp.next;
    }

    public static void printData(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        Node head = first;

        printData(head);
        System.out.println(new RemoveNthNodeEnd().removeNthFromEnd(head, 2));
        printData(head);
    }
}
