package Medium;

/**
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the
 * largest product, and return the product.
 *
 * It is guaranteed that the answer will fit in a 32-bit integer.
 *
 * A subarray is a contiguous subsequence of the array.
 */
public class MaximumProductSubarray {
  // Time: O(n)
  // Space: O(1)
  public int maxProduct(int[] nums) {
    // check edge cases
    if (nums == null) {
      return 0;
    }
    // initialize a currMin, currMax, and result
    int currMin = nums[0];
    int currMax = nums[0];
    int result = nums[0];
    // iterate through array
    for (int i = 1; i < nums.length; i ++) {
      int curr = nums[i];
      // set max to temp variable
      int tempMax = currMax;
      // determine the max so far
      tempMax = Math.max(curr, Math.max(currMax * curr, currMin * curr));
      // determine the min so far
      currMin = Math.min(curr, Math.min(currMax * curr, currMin * curr));
      // update result
      currMax = tempMax;
      result = Math.max(currMax, result);
    }
    // return result
    return result;
  }
}
