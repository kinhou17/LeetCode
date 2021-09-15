package Medium;
/**
 *
 You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.

 Define a pair (u, v) which consists of one element from the first array and one element from
 the second array.

 Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
 */

import java.util.ArrayList;
import java.util.List;

public class FindKPairsWithSmallestSum {
  public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    List<int[]> ret = new ArrayList<int[]>();
    if (nums1.length == 0 || nums2.length == 0 || k == 0) {
      return ret;
    }

    int[] index = new int[nums1.length];
    while (k-- > 0) {
      int min_val = Integer.MAX_VALUE;
      int in = -1;
      for (int i = 0; i < nums1.length; i++) {
        if (index[i] >= nums2.length) {
          continue;
        }
        if (nums1[i] + nums2[index[i]] < min_val) {
          min_val = nums1[i] + nums2[index[i]];
          in = i;
        }
      }
      if (in == -1) {
        break;
      }
      int[] temp = {nums1[in], nums2[index[in]]};
      ret.add(temp);
      index[in]++;
    }
    return ret;
  }
}
