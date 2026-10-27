package LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveDupLL {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    void printList(ListNode current) {

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(20);
        ListNode fifth = new ListNode(30);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        ListNode head = first;

        System.out.println(new RemoveDupLL().deleteDuplicates(head));
        new RemoveDupLL().printList(head);
    }
}
