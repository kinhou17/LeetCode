package Easy;

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfABinaryTree {
  // Time: O(n)
  // Space: O(log(N))
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
  }
}
