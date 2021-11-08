package Medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;
    // if (nums.length == 1) return 1;
    Arrays.sort(nums);
    int curMax = 1;
    int length = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        if (nums[i + 1] == nums[i] + 1) {
          length++;
        } else {
          length = 1;
        }
      }
      curMax = Math.max(curMax, length);
    }

    return curMax;
  }
}
