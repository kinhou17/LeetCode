package Medium;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */

public class RemoveNthFromEnd {
  // time: O(n)
  // space: O(1)
  public ListNode removeNthFromEnd(ListNode head, int n) {
    // initialize 2 pointers
    ListNode start = new ListNode();
    start.next = head;
    ListNode first = start;
    ListNode second = start;
    // iterate 1 until n
    while (n > 0 && first != null) {
      first = first.next;
      n--;
    }
    // iterate both unitl first hits end
    while (first.next != null) {
      first = first.next;
      second = second.next;
    }
    // remove nth node
    second.next = second.next.next;

    return start.next;
  }
}
