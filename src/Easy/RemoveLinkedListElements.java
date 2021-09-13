package Easy;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list
 * that has Node.val == val, and return the new head.
 */
public class RemoveLinkedListElements {
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode h = dummy;

    while (h.next != null) {
      if (h.next.val == val) {
        h.next = h.next.next;
      } else {
        h = h.next;
      }
    }
    return dummy.next;
  }
}
