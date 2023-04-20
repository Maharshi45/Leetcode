package com.maharshi;

public class SwapPairs {

    public static ListNode swapPairs(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {
            if (head == current) {
                ListNode temp = current.next;
                current.next = temp.next;
                temp.next = current;
                head = temp;
            } else if (current.next.next != null) {
                ListNode temp1 = current.next;
                ListNode temp2 = current.next.next;
                ListNode temp3 = current.next.next.next;
                current.next = temp2;
                temp2.next = temp1;
                temp1.next = temp3;
                current = temp1;
            } else {
                break;
            }
        }

        return head;

    }

    public static void diplayList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + ", ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        diplayList(swapPairs(head));

    }

}
