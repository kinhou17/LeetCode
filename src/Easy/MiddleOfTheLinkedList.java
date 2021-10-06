package Easy;

public class MiddleOfTheLinkedList {
  public ListNode middleNode(ListNode head) {
    ListNode first = head;
    ListNode second = head;

    while (first.next != null && first.next.next != null) {
      first = first.next.next;
      second = second.next;
    }
    if (first.next == null) {
      return second;
    }
    return second.next;
  }
}
