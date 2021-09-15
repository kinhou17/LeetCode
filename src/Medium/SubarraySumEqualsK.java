package Medium;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer k, return the total number of continuous
 * subarrays whose sum equals to k.
 */
public class SubarraySumEqualsK {
  public int subarraySum(int[] nums, int k) {
    HashMap<Integer, Integer> sums = new HashMap<>();
    sums.put(0, 1);
    int counter = 0;
    int curSum = 0;
    for (int i = 0; i < nums.length; i++) {
      curSum = curSum + nums[i];
      if (sums.containsKey(curSum - k)) {
        counter += sums.get(curSum - k);
      }
      if (sums.containsKey(curSum)) {
        sums.put(curSum, sums.get(curSum) + 1);
      } else {
        sums.put(curSum, 1);
      }
    }
    return counter;
  }
}
