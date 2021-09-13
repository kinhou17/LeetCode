package Easy;

/**
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two
 * lists intersect. If the two linked lists have no intersection at all, return null.
 *
 */
public class IntersectionOfTwoLinkedLists {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lenA = getLength(headA);
    int lenB = getLength(headB);
    while (lenA > lenB) {
      headA = headA.next;
      lenA--;
    }
    while (lenA < lenB) {
      headB = headB.next;
      lenB--;
    }
    while (headA != headB) {
      headA = headA.next;
      headB = headB.next;
    }
    return headA;

  }

  public int getLength(ListNode head) {
    int length = 0;
    while (head != null) {
      length++;
      head = head.next;
    }
    return length;
  }

}
