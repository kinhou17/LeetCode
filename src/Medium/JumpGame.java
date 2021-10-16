package Medium;

public class JumpGame {
  public boolean canJump(int[] nums) {
    if (nums == null || nums.length == 0) return false;
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > max) return false;
      max = Math.max(max, nums[i] + i);
    }
    return true;
  }
}
