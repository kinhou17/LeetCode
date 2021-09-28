package Medium;

import java.util.Arrays;

/**
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
 *
 * Return the sum of the three integers.
 *
 * You may assume that each input would have exactly one solution.
 */
public class ThreeSumClosest {
  public int threeSumClosest(int[] nums, int target) {
    // Time: O(n^2)
    // Space: O(n) or O(nlogn) (sort)

    // Perform threesum (sort)
    // Check if sum is closer

    Arrays.sort(nums);
    int currDifference = Integer.MAX_VALUE;
    int currTotal = 0;

    for (int i = 0; i < nums.length; i++) {
      int lo = i + 1;
      int hi = nums.length - 1;

      while (lo < hi) {
        int total = nums[i] + nums[lo] + nums[hi];
        int difference = target - total;
        if (total == target) {
          return target;
        } else if (total > target) {
          hi--;
        } else {
          lo++;
        }
        System.out.println(difference);
        if (Math.abs(difference) < Math.abs(currDifference)) {
          currDifference = difference;
          currTotal = total;
        }

      }
    }
    return currTotal;
  }
}
