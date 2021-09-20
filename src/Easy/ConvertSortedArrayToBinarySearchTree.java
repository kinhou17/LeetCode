package Easy;

/**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 *
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every
 * node never differs by more than one.
 */
public class ConvertSortedArrayToBinarySearchTree {
  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums.length == 0) {
      return null;
    }
    TreeNode head = toBST(nums, 0, nums.length - 1);
    return head;
  }

  public TreeNode toBST(int[] num, int low, int high) {
    if (low > high) {
      return null;
    }
    int mid = (low + high) / 2;
    TreeNode node = new TreeNode(num[mid]);
    node.left = toBST(num ,low, mid - 1);
    node.right = toBST(num, mid + 1, high);

    return node;
  }
}
