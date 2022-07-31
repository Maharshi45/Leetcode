package com.maharshi;

public class MergeTwoLists {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		ListNode head = null;
		ListNode curr3 = null;

		while (list1 != null && list2 != null) {
			ListNode temp = null;
			if (list1.val < list2.val) {
				temp = list1;
				list1 = list1.next;
				temp.next = null;
				if (head == null) {
					head = temp;
					curr3 = head;
				} else {
					curr3.next = temp;
					curr3 = curr3.next;
				}
			} else {
				temp = list2;
				list2 = list2.next;
				temp.next = null;
				if (head == null) {
					head = temp;
					curr3 = head;
				} else {
					curr3.next = temp;
					curr3 = curr3.next;
				}
			}
		}
		if (list1 == null) {
			curr3.next = list2;
		} else {
			curr3.next = list1;
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

		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(5);
		list1.next.next = new ListNode(6);
		list1.next.next.next = new ListNode(7);
		list1.next.next.next.next = new ListNode(9);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);
		list2.next.next.next = new ListNode(8);
		list2.next.next.next.next = new ListNode(10);
		list2.next.next.next.next.next = new ListNode(11);
		list2.next.next.next.next.next.next = new ListNode(12);

//		System.out.println("List 1 : ");
//		diplayList(list1);
//		System.out.println("List 2 : ");
//		diplayList(list2);
//		System.out.println("result: ");
		diplayList(mergeTwoLists(list1, list2));

	}

}
