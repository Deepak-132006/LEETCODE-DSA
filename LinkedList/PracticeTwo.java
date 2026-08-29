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

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    boolean search(int target) {
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    int length() {
        int count = 0;

        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

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

public class PracticeTwo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAtBeginning(0);

        list.insertAtPosition(5, 1);
        list.display();
        list.deleteAtPosition(0);
        list.display();
        System.out.println(list.search(30));
        System.out.println(list.length());
        list.reverse();
        list.display();
    }
}
