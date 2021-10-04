package Easy;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
  // Time: O(n)
  // Space: O(1)

  public int climbStairs(int n) {
    // edge case
    if (n == 1) return 1;

    // define step sizes
    int first = 1;
    int second = 2;
    // perform fibonacci on desired range
    for (int i = 3; i <= n; i++) {
      int third = first + second;
      first = second;
      second = third;
    }
    return second;
  }
}
