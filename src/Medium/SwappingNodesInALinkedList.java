package Medium;

/**
 * You are given the head of a linked list, and an integer k.
 *
 * Return the head of the linked list after swapping the values of the kth node from the beginning
 * and the kth node from the end (the list is 1-indexed).
 */
public class SwappingNodesInALinkedList {
  public ListNode swapNodes(ListNode head, int k) {
    ListNode fast = head;
    ListNode slow = head;
    ListNode first = head;
    ListNode second = head;

    for (int i = 1; i < k; i++) {
      fast = fast.next;
    }
    first = fast;
    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }
    second = slow;
    int temp = first.val;
    first.val = second.val;
    second.val = temp;

    return head;
  }

}
