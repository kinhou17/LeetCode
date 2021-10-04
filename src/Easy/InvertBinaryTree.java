package Easy;

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree {
  // Time: O(n)
  // Space: O(nlog(n))
  public TreeNode invertTree(TreeNode root) {
    // call recursive method to invert
    helper(root);
    // return the root
    return root;
  }

  private void helper(TreeNode root) {
    // return condition
    if (root == null) return;
    // swap nodes
    TreeNode temp = root.right;
    root.right = root.left;
    root.left = temp;
    // recursively iterate
    helper(root.left);
    helper(root.right);
  }
}
