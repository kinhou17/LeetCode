package Medium;

import java.util.*;
import java.util.HashMap;

public class CloneGraph {
  // Time: O(n + m)
  // Space: O(n)

  private HashMap<Node, Node> visited = new HashMap<>();

  // DFS
  public Node cloneGraph(Node node) {
    // base case
    if (node == null) return node;
    //node already visited before
    if (visited.containsKey(node)) {
      // return the clone
      return visited.get(node);
    }
    // create clone for given node
    Node cloneNode = new Node(node.val, new ArrayList());
    // add original, cloned node to visited map
    visited.put(node, cloneNode);
    // iterate through neighbors to generate their clones
    for (Node neighbor : node.neighbors) {
      // prepare list of cloned neighbors to add to cloned node
      cloneNode.neighbors.add(cloneGraph(neighbor));
    }
    return cloneNode;
  }

  //------------------------------------------------------------------------------


  // Time: O(n + m)
  // Space: O(n)
  public Node cloneGraphBFS(Node node) {
    // edge case
    if (node == null) return node;
    // track visited nodes
    HashMap<Node, Node> visited = new HashMap<>();
    // put first node in the queue
    LinkedList<Node> queue = new LinkedList<>();
    queue.add(node);
    // clone the node and put in visited
    visited.put(node, new Node(node.val, new ArrayList()));

    // begin bfs traversal
    while (!queue.isEmpty())  {
      // pop from top of queue
      Node n = queue.pop();
      // iterate through neighbors of node
      for (Node neighbor : n.neighbors) {
        // if neighbor not already visited
        if (!visited.containsKey(neighbor)) {
          // clone neighbor and put in visited
          visited.put(neighbor, new Node(neighbor.val, new ArrayList()));
          // add this new neighbor to the queue
          queue.add(neighbor);
        }
        // add clone of neighbor to neighbors of clone n
        visited.get(n).neighbors.add(visited.get(neighbor));
      }
    }

    // return clone of the node
    return visited.get(node);
  }

}
