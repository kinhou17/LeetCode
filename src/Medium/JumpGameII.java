package Medium;

public class JumpGameII {
  public int jump(int[] nums) {
    int jumps = 0, currEnd = 0, currFarthest = 0;
    for (int i = 0; i < nums.length; i++) {
      currFarthest = Math.max(currFarthest, i + nums[i]);
      if (i == currEnd) {
        currEnd = currFarthest;
        jumps++;
      }
    }
    return jumps;
  }
}
