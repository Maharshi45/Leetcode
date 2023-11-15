package com.maharshi;

public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        int i = 0;
        while (i != n) {
            fast = fast.next;
            i++;
        }

        ListNode prev = null;
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        if (prev != null) {
            prev.next = slow.next;
            slow.next = null;
        } else {
            head = head.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode current = removeNthFromEnd(head, 3);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }

}
