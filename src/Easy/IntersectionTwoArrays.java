package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element
 * in the result must be unique and you may return the result in any order
 */
public class IntersectionTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums1) {
      if (!set.contains(num)) {
        set.add(num);
      }
    }
    List<Integer> result = new ArrayList<>();
    for (int num : nums2) {
      if (set.contains(num)) {
        result.add(num);
        set.remove(num);
      }
    }
    int[] results = new int[result.size()];
    int i = 0;
    for (Integer res : result) {
      results[i] = res;
      i++;
    }
    return results;
  }
}
