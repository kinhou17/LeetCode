package Easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is
 * palindrome while 123 is not.
 */
public class PalindromeNumber {
  public boolean isPalindrome(int x) {
    // Time: O(n)
    // Space: O(n)
    String num = String.valueOf(x);
    int lo = 0;
    int hi = num.length() - 1;
    while (hi > lo) {
      if (num.charAt(lo) != num.charAt(hi)) {
        return false;
      }
      lo++;
      hi--;
    }
    return true;
  }
}
