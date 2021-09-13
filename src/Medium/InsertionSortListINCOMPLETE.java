package Medium;

/**
 * Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
 *
 * The steps of the insertion sort algorithm:
 *
 * Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
 * It repeats until no input elements remain.
 * The following is a graphical example of the insertion sort algorithm. The partially sorted list (black)
 * initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.
 */
public class InsertionSortListINCOMPLETE {
  public ListNode insertionSortList(ListNode head) {
    if( head == null ){
      return head;
    }

    ListNode helper = new ListNode(0); //new starter of the sorted list
    ListNode cur = head; //the node will be inserted
    ListNode pre = helper; //insert node between pre and pre.next
    ListNode next = null; //the next node will be inserted
    //not the end of input list
    while( cur != null ){
      next = cur.next;
      //find the right place to insert
      while( pre.next != null && pre.next.val < cur.val ){
        pre = pre.next;
      }
      //insert between pre and pre.next
      cur.next = pre.next;
      pre.next = cur;
      pre = helper;
      cur = next;
    }

    return helper.next;
  }
}
