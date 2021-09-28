package Medium;

/**
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the
 * problem without modifying the values in the list's nodes (i.e., only nodes themselves may be
 * changed.)
 */
public class SwapNodesInPairs {
  public ListNode swapPairs(ListNode head) {
    // Time: O(n)
    // Space: O(1)

    // set it up
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;

    while (head != null && head.next != null) {
      ListNode first = head;
      ListNode second = head.next;

      // swap em
      prev.next = second;
      first.next = second.next;
      second.next = first;

      prev = first;
      head = first.next;
    }

    return dummy.next;
  }
}
