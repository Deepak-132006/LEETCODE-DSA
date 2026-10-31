package LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode (int val) {
        this.val = val;
        this.next = null;
    }
}

public class IntersectionOfTwoList {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cA = headA;
        ListNode cB = headB;

        while (cA != cB) {
            cA = (cA == null) ? headA.next : cA.next;
            cB = (cB == null) ? headB.next : cB.next;
        }
        return cA;
    }

public static void main(String[] args) {

    // TEST CASE 1: Intersection in the middle
    ListNode shared1 = new ListNode(8);
    shared1.next = new ListNode(9);

    ListNode headA1 = new ListNode(1);
    headA1.next = new ListNode(2);
    headA1.next.next = new ListNode(3);
    headA1.next.next.next = shared1;

    ListNode headB1 = new ListNode(4);
    headB1.next = new ListNode(5);
    headB1.next.next = shared1;

    System.out.println("Test 1: " +
        (getIntersectionNode(headA1, headB1) != null
        ? getIntersectionNode(headA1, headB1).val : "null"));


    // TEST CASE 2: Different list lengths
    ListNode shared2 = new ListNode(50);
    shared2.next = new ListNode(60);

    ListNode headA2 = new ListNode(10);
    headA2.next = new ListNode(20);
    headA2.next.next = new ListNode(30);
    headA2.next.next.next = new ListNode(40);
    headA2.next.next.next.next = shared2;

    ListNode headB2 = new ListNode(5);
    headB2.next = shared2;

    System.out.println("Test 2: " +
        (getIntersectionNode(headA2, headB2) != null
        ? getIntersectionNode(headA2, headB2).val : "null"));


    // TEST CASE 3: Intersection at head of List A
    ListNode shared3 = new ListNode(1);
    shared3.next = new ListNode(2);
    shared3.next.next = new ListNode(3);

    ListNode headA3 = shared3;

    ListNode headB3 = new ListNode(7);
    headB3.next = shared3;

    System.out.println("Test 3: " +
        (getIntersectionNode(headA3, headB3) != null
        ? getIntersectionNode(headA3, headB3).val : "null"));


    // TEST CASE 4: No intersection
    ListNode headA4 = new ListNode(1);
    headA4.next = new ListNode(2);
    headA4.next.next = new ListNode(3);

    ListNode headB4 = new ListNode(4);
    headB4.next = new ListNode(5);
    headB4.next.next = new ListNode(6);

    System.out.println("Test 4: " +
        (getIntersectionNode(headA4, headB4) != null
        ? getIntersectionNode(headA4, headB4).val : "null"));


    // TEST CASE 5: Both lists are identical
    ListNode shared5 = new ListNode(1);
    shared5.next = new ListNode(2);
    shared5.next.next = new ListNode(3);
    shared5.next.next.next = new ListNode(4);

    ListNode headA5 = shared5;
    ListNode headB5 = shared5;

    System.out.println("Test 5: " +
        (getIntersectionNode(headA5, headB5) != null
        ? getIntersectionNode(headA5, headB5).val : "null"));
}
}
