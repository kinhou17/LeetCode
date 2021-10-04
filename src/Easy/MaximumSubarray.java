package Easy;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * A subarray is a contiguous part of an array.
 */
public class MaximumSubarray {
  public int maxSubArray(int[] nums) {
    // Edge cases
    if (nums == null) {
      return 0;
    }
    // Set max subarray and current subarray
    int currentSub = nums[0];
    int maxSub = nums[0];
    // iterate through nums
    for(int i = 1; i < nums.length; i++) {
      // check if current subarray is less than zero
      if(currentSub < 0) {
        // start at current if so
        currentSub = nums[i];
      } else {
        currentSub += nums[i];
      }
      // check if subarray is bigger than the max
      maxSub = Math.max(maxSub, currentSub);
    }
    // return
    return maxSub;
  }
}
