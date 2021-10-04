package Easy;

/**
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root
 * with the same structure and node values of subRoot and false otherwise.
 *
 * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's
 * descendants. The tree tree could also be considered as a subtree of itself.
 */
public class SubtreeOfAnotherTree {
  // Time: O(n * m)
  // Space: O(log(n))

  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    // check return condition
    if (root == null) return false;
    // check if same subtree
    if(isSame(root, subRoot)) return true;
    // recurse
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  public boolean isSame(TreeNode root, TreeNode subRoot) {
    // check return condition
    if (root == null && subRoot == null) return true;
    if (root == null || subRoot == null) return false;
    // check if subtrees are same
    if (root.val != subRoot.val) return false;
    //return
    return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
  }
}
