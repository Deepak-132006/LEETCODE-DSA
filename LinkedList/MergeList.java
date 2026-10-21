package Linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeList {
    Node head;
    public Node mergeTwoLists(Node list1, Node list2) {
        Node temp = new Node(0);
        Node tail = temp;

        while(list1 != null && list2 != null){
            if(list1.data <= list2.data){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if(list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return temp.next;
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
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = null;
        third.next = fourth;
        fourth.next = null;

        Node head = first;
        new MergeList().printList(head);
        System.out.println(new MergeList().mergeTwoLists(first, third));
        new MergeList().printList(head);
    }
}
