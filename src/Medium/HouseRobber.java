package Medium;

public class HouseRobber {
  public int rob(int[] nums) {
    // edge case
    if (nums.length == 0) return 0;
    // define vars
    int prev1 = 0;
    int prev2 = 0;
    // iterate
    for(int i = 0; i < nums.length; i++) {
      int temp = prev1;
      prev1 = Math.max(prev1, prev2 + nums[i]);
      prev2 = temp;
    }

    return prev1;
  }
}
