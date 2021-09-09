package Easy;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative
 * order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    /*
    BETTER SOLUTION
    if (nums == null || nums.length == 0) return;

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }
     */
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        int j = i;
        while (j < nums.length - 1 && nums[j] == 0) {
          j++;
        }
        nums[i] = nums[j];
        nums[j] = 0;
      }
    }
  }
}
