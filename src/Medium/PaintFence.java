package Medium;

/**
 * You are painting a fence of n posts with k different colors. You must paint the posts following these rules:
 *
 * Every post must be painted exactly one color.
 * There cannot be three or more consecutive posts with the same color.
 * Given the two integers n and k, return the number of ways you can paint the fence.
 */
public class PaintFence {
  public int numWays(int n, int k) {
    if (n == 0) return 0;
    if (n == 1) return k;
    if (n == 2) return k*k;

    int[] table = new int[n + 1];
    table[0] = 0;
    table[1] = k;
    table[2] = k * k;

    for (int i = 3; i < n + 1; i++) {
      table[i] = (table[i - 1] + table[i - 2]) * (k - 1);
    }
    return table[n];
  }
}
