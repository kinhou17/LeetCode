package Medium;

import java.util.HashSet;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position
 * of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
  public int[] searchRange(int[] nums, int target) {

    return new int[]{findLo(nums, target), findHi(nums, target)};

  }

  public int findLo(int[] nums, int target) {
    int lo = 0;
    int hi = nums.length - 1;
    int index = -1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] >= target) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
      if (nums[mid] == target) {
        index = mid;
      }
    }
    return index;
  }

  public int findHi(int[] nums, int target) {
    int lo = 0;
    int hi = nums.length - 1;
    int index = -1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] <= target) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
      if (nums[mid] == target) {
        index = mid;
      }
    }
    return index;
  }
}
