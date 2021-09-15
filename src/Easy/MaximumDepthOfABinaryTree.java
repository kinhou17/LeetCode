package Easy;

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfABinaryTree {
  public int maxDepth(TreeNode root) {
    return maxDepth(root, 0);
  }

  public int maxDepth(TreeNode curNode, int level) {
    if (curNode == null) return level;
    return Math.max(maxDepth(curNode.left, level + 1), maxDepth(curNode.right, level + 1));
  }
}
