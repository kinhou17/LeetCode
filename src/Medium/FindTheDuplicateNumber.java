package Medium;

import java.util.HashSet;

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 */
public class FindTheDuplicateNumber {
  public int findDuplicate(int[] nums) {
    //-----------Does not work
    int slow = nums[0];
    int fast = nums[0];

    while (slow != fast) {
      slow = nums[slow];
      fast = nums[nums[fast]];
    }

    fast = 0;
    while (fast != slow) {
      slow = nums[slow];
      fast = nums[fast];
    }
    return fast;

    /*
    HashSet<Integer> numbers = new HashSet();
    for (int i : nums) {
      if(!numbers.add(i)) {
        return i;
      }
    }
    return 0;

     */
  }
}
