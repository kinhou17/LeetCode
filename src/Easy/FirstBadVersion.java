package Easy;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {
  // Time: O(logn)
  // Space: O(1)
  public int firstBadVersion(int n) {
    int hi = n;
    int lo = 0;
    boolean badFound = false;

    while (hi > lo) {
      int mid = lo + (hi - lo) / 2;

      if (isBadVersion(mid)) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }

    return lo;
  }

  private boolean isBadVersion(int mid) {
    return false;
  }
}
