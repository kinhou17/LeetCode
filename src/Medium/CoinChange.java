package Medium;

/**
 * You are given an integer array coins representing coins of different denominations and an
 * integer amount representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money
 * cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 */
public class CoinChange {
  public int coinChangeRecursive(int[] coins, int amount) {
    if (amount < 1) {
      return 0;
    }
    return coinChange(coins, amount, new int[amount + 1]);
  }

  private int coinChange(int[] coins, int rem, int[] count) {
    if (rem < 0) return -1;
    if (rem == 0) return 0;
    if (count[rem] != 0) return count[rem];
    int min = Integer.MAX_VALUE;
    for (int coin : coins) {
      int res = coinChange(coins, rem - coin, count);
      if (res != -1) {
        min = Math.min(res + 1, min);
      }
    }
    if (min == Integer.MAX_VALUE) {
      count[rem] = -1;
    } else {
      count[rem] = min;
    }
    return count[rem];

  }

  public int coinChangeIterative(int[] coins, int amount) {
    // Create an array to hold subproblems
    int[] dp = new int[amount + 1];
    // iterate through the array
    for (int i = 1; i <= amount; i++) {
      // set min to arbitrary high value for comparisons
      int min = Integer.MAX_VALUE;
      // iterate through possible coins
      for (int coin : coins) {
        // check if subproblem exists
        if (i - coin >= 0 && dp[i - coin] != -1) {
          // update min value if new min
          min = Math.min(dp[i - coin], min);
        }
      }
      // check if was a valid subproblem
      if (min == Integer.MAX_VALUE) {
        // set to -1
        dp[i] = -1;
      } else {
        // set to min for current amount
        dp[i] = min + 1; // add the coin
      }
    }
    // return the answer
    return dp[amount];
  }
}
