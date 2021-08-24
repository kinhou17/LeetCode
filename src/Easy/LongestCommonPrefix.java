package Easy;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }
    Arrays.sort(strs);
    String first = strs[0];
    String last = strs[strs.length - 1];
    int currentChar = 0;
    while (currentChar < first.length()) {
      if (first.charAt(currentChar) == last.charAt(currentChar)) {
        currentChar++;
      } else {
        break;
      }
    }
    return currentChar == 0 ? "" : first.substring(0, currentChar);
  }
}
