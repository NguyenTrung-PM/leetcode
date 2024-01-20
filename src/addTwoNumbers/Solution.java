package addTwoNumbers;

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode();
		ListNode current = result;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			int sum = carry;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;
		}

		return result.next;

	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
      ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//		ListNode l1 = new ListNode(0);
//		ListNode l2 = new ListNode(0);
//		ListNode l1 = new ListNode(9,
//				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
//		ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

		Solution s = new Solution();

		ListNode result = s.addTwoNumbers(l1, l2);
		printLinkedList(result);
	}

	// Phương thức để in giá trị của các nút trong danh sách liên kết
	public static void printLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
	}

}