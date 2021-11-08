package Medium;

import java.util.Deque;
import java.util.LinkedList;

public class RecoverBinaryTree {
  public void recoverTree(TreeNode root) {
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode x = null;
    TreeNode y = null;
    TreeNode pred = null;
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (pred != null && root.val < pred.val) {
        y = root;
        if (x == null) {
          x = pred;
        } else {
          break;
        }
      }
      pred = root;
      root = root.right;

    }

    int tmp = x.val;
    x.val = y.val;
    y.val = tmp;



  }
}
