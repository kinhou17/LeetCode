package Easy;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares
 * of each number sorted in non-decreasing order.
 */
public class SquaresOfASortedArray {
  public int[] sortedSquares(int[] nums) {
    // define pointers
    int start = 0;
    int end = nums.length - 1;
    int i = end;
    // define array
    int[] results = new int[nums.length];
    // iterate through list
    while (start < end) {
      if (Math.abs(nums[start]) > Math.abs(nums[end])) {
        results[i--] = nums[start] * nums[start];
        start++;
      } else {
        results[i--] = nums[end] * nums[end];
        end--;
      }
    }

    return results;
  }
}
