package Medium;

import java.util.*;
import java.util.Stack;

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
  public boolean isValidBST(TreeNode root) {
    if (root == null) return true;
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode pre = null;
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (pre != null && root.val <= pre.val) return false;
      pre = root;
      root = root.right;
    }
    return true;
  }
}


  // https://leetcode.com/problems/validate-binary-search-tree/discuss/32112/Learn-one-iterative-inorder-traversal-apply-it-to-multiple-tree-questions-(Java-Solution)

