package Easy;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {
  // Time: O(1)
  // Space: O(n)
  public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;

    while (curr != null) {
      ListNode prevNext = curr.next;
      curr.next = prev;
      prev = curr;
      curr = prevNext;
    }

    return prev;
  }
}
