package Easy;

import java.util.*;

public class SumOfLeftLeaves {
  public int sumOfLeftLeaves(TreeNode root) {
    Deque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    int total = 0;
    while (!stack.isEmpty()) {
      TreeNode n = stack.pop();
      if (n.left != null && n.left.left == null && n.left.right == null) {
        total += n.left.val;
      }
      if (n.left != null) {
        stack.add(n.left);
      }
      if (n.right != null) {
        stack.add(n.right);
      }
    }
    return total;
  }
}
