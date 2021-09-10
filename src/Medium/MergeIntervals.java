package Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 */
public class MergeIntervals {
  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, m m(a, b) -> Integer.compare(a[0], b[0]));
    LinkedList<int[]> merged = new LinkedList<>();
    for (int[] interval : intervals) {
      // if the list of merged intervals is empty or if the current
      // interval does not overlap with the previous, simply append it.
      if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
        merged.add(interval);
      }
      // otherwise, there is overlap, so we merge the current and previous
      // intervals.
      else {
        merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
      }
    }
    return merged.toArray(new int[merged.size()][]);
  }

    /*
    NONWORKING
    HashMap<Integer, Integer> map = new HashMap<>();
    int currMax = intervals[0][1];
    int currKey = intervals[0][0];
    int count = 0;
    for (int i = 0; i < intervals.length; i++) {
      if (intervals[i][0] <= currMax) {
        if (intervals[i][0] < currKey) {
          map.remove(currKey);
          currKey = intervals[i][0];
        }
        currMax = intervals[i][1];
        map.put(currKey, currMax);
        continue;
      }
      currKey = intervals[i][0];
      map.put(intervals[i][0], intervals[i][1]);
      count++;
    }
    int[][] ans = new int[count + 1][2];
    int i = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      ans[i][0] = entry.getKey();
      ans[i][1] = entry.getValue();
      i++;
    }
    return ans;
  }

     */
}
