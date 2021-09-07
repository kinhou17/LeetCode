package Hard;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from
 * the very left of the array to the very right. You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 *
 * Return the max sliding window.
 */
public class SlidingWindowMaximum {
  public int[] maxSlidingWindow(int[] nums, int k) {
    // assume nums is not null
    int n = nums.length;
    if (n == 0 || k == 0) {
      return new int[0];
    }

    int[] result = new int[n - k + 1]; // number of windows
    Deque<Integer> win = new ArrayDeque<>(); // stores indices

    for (int i = 0 ; i < n; ++i) {
      // remove indices that are still out of bound
      while(win.size() > 0 && win.peekFirst() <= i - k) {
        win.pollFirst();
      }
      // remove indices whose corresponding values are less than nums[i]
      while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
        win.pollLast();
      }
      // add nums
      win.offerLast(i);
      // add to result
      if (i >= k - 1) {
        result[i - k + 1] = nums[win.peekFirst()];
      }
    }
    return result;

    /*
    // window slide problem (window size k)
    // check if max value
    // hold a current max value/max index
    int[] maxValues = new int[nums.length - k + 1];
    int maxValue = nums[0];
    int maxIndex = 0;
    for (int i = k - 1; i < nums.length; i++) {
      if (maxIndex <= i - k) {

      }
      if (nums[i] > maxValue) {
        maxValue = nums[i];
        maxIndex = i;
      }

      maxValues[i - k + 1] = maxValue;
    }

     */
  }
}
