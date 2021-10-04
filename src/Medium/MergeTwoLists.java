package Medium;

public class MergeTwoLists {

  // Time: (O(n + m))
  // Space: O(1)
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // create new head
    ListNode preHead = new ListNode();
    ListNode last = preHead;
    // iterate through both lists
    while (l1 != null && l2 != null) {
      // compare, set pointer, iterate
      if (l2.val <= l1.val) {
        last.next = l2;
        l2 = l2.next;
      } else if (l2.val > l1.val) {
        last.next = l1;
        l1 = l1.next;
      }
      last = last.next;
    }
    // if one list is empty set the remainder to the rest of other list
    if (l1 == null) {
      last.next = l2;
    } else if (l2 == null) {
      last.next = l1;
    }
    // return
    return preHead.next;
  }
}
