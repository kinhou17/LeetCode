package Easy;

public class BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    if (prices.length == 0) return 0;

    int max = 0;
    int currMin = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > currMin) {
        max = Math.max(max, prices[i] - currMin);
      } else {
        currMin = prices[i];
      }
    }
    return max;
  }

}
