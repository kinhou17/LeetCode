package Easy;

public class SymmetricTree {
  // Time: O(n)
  // Space: O(n)
  public boolean isSymmetric(TreeNode root) {
    // check if root tree is mirror of itself
    return isMirror(root, root);
  }

  private boolean isMirror(TreeNode t1, TreeNode t2) {
    // base conditions
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    if (t1.val != t2.val) return false;
    // iterate down trees, checking if mirror each other
    return (isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right));
  }
}
