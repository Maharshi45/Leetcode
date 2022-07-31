package com.maharshi;

public class RemoveNthFromEnd {

	public static ListNode reverseLinkedList(ListNode node) {
		ListNode prev = null;
		ListNode current = node;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		head = reverseLinkedList(head);
		ListNode current = head;

		if (n == 1) {
			head = head.next;
		} else {

			int i = 1;
			ListNode prev = null;
			while (i != n) {
				prev = current;
				current = current.next;
				i++;
			}
			if (current == null)
				prev.next = null;
			else
				prev.next = current.next;
			current.next = null;
		}
		head = reverseLinkedList(head);

		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		head = removeNthFromEnd(head, 1);

		ListNode current = head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}

	}

}
