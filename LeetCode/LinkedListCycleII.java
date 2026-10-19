package LeetCode;

class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycleII {
    public Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }

        }

        return null;
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        Node head = first;

        System.out.println(new LinkedListCycleII().detectCycle(head).data);
    }
}
