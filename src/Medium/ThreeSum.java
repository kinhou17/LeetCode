package Medium;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
 * i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    // Time: O(n^2);
    // Space: O(n);

    if (nums.length < 3) {
      return Collections.emptyList();
    }

    Set<List<Integer>> set = new HashSet<>();

    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      int complement = -nums[i];
      int lo = i + 1;
      int hi = nums.length - 1;

      while (lo < hi) {
        if (nums[lo] + nums[hi] == complement) {
          set.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
          lo++;
          hi--;
        } else if (nums[lo] + nums[hi] > complement) {
          hi--;
        } else {
          lo++;
        }
      }
    }
    return new ArrayList(set);
  }
}
