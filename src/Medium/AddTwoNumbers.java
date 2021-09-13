package Medium;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits
 * are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers
 * and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode result = new ListNode();
    ListNode returnNode = result;

    while (l1 != null || l2 != null) {
      if (l1 == null) {
        l1 = new ListNode(0);
      }
      if (l2 == null) {
        l2 = new ListNode(0);
      }
      int val = l1.val + l2.val + carry;
      if (val >= 10) {
        val = val % 10;
        carry = 1;
      } else {
        carry = 0;
      }
      result.val = val;
      if (l1.next != null || l2.next != null) {
        result.next = new ListNode();
        result = result.next;
      }
      l1 = l1.next;
      l2 = l2.next;
    }

    if (carry == 1) {
      result.next = new ListNode(1);
    }
    return returnNode;
  }
}
