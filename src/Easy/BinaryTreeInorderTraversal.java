package Easy;

import java.util.*;

public class BinaryTreeInorderTraversal {
  // Time: O(n)
  // Space: O(n)
  public List<Integer> inorderTraversal(TreeNode root) {
    // initialize stack and array
    Deque<TreeNode> stack = new LinkedList<>();
    List<Integer> returnList = new ArrayList<>();
    // traverse nodes
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      returnList.add(root.val);
      root = root.right;
    }

    return returnList;
  }
}
