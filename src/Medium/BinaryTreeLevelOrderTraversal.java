package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
  // TIme: O(n)
  // SPace O(n)
  public List<List<Integer>> levelOrder(TreeNode root) {
    // create list
    List<List<Integer>> levels = new ArrayList<>();
    // call recursive method to travers
    levelOrder(levels, root, 0);
    // return list
    return levels;
  }

  public void levelOrder(List<List<Integer>> levels, TreeNode node, int level) {
    // check return condition
    if (node == null) return;
    // add to list
    if (level >= levels.size()) {
      levels.add(level, new ArrayList<>());
    }
    levels.get(level).add(node.val);
    // recurse
    levelOrder(levels, node.left, level + 1);
    levelOrder(levels, node.right, level + 1);
  }


}
