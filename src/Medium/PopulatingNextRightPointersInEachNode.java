package Medium;

import java.util.*;

public class PopulatingNextRightPointersInEachNode {
  /*
  // Time: O(n)
  // Space: O(n)
  public Node connect(Node root) {
    if (root == null) return null;
    Deque<Node> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        Node node = queue.poll();

        if (i < size - 1) {
          node.next = queue.peek();
        }
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
    }

    return root;
  }

   */
}