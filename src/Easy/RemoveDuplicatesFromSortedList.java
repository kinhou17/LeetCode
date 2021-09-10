package Easy;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears
 * only once. Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedList {
  public ListNode deleteDuplicates(ListNode head) {
    if(head == null || head.next == null) return head;
    ListNode list = head;
    while (list.next != null) {
      if (list.next.val == list.val) {
        list.next = list.next.next;
      } else {
        list = list.next;
      }
    }
    return head;
  }

}
