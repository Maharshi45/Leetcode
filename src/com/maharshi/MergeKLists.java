package com.maharshi;

public class MergeKLists {

    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode head = null;
        ListNode current = null;
        while (true) {
            int index = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < min) {
                    index = i;
                    min = lists[i].val;
                }
            }
            if (index == -1)
                break;
            ListNode temp = lists[index];
            lists[index] = lists[index].next;
            if (head == null) {
                head = temp;
                current = head;
            } else {
                current.next = temp;
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(6);

        displayList(mergeKLists(new ListNode[]{head1, head2, head3}));

    }

    public static void displayList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + ", ");
            curr = curr.next;
        }
    }

}
