package Medium;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */

public class RemoveNthFromEnd {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode start = new ListNode(0);
    start.next = head;
    ListNode slow = start;
    ListNode fast = start;

    for (int i = 1; i <= n + 1; i++) {
      fast = fast.next;
    }

    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    slow.next = slow.next.next;
    return start.next;
  }
}
