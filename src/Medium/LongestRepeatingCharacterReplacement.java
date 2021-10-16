package Medium;

public class LongestRepeatingCharacterReplacement {
  public int characterReplacement(String s, int k) {
    int[] c = new int[26];
    int maxCount = 0;
    int start = 0;
    int maxSize = 0;

    for (int end = 0; end < s.length(); end++) {
      c[s.charAt(end) - 'A']++;
      maxCount = Math.max(maxCount, c[s.charAt(end) - 'A']);
      // need to shrink window (length of substrink - maxOccurrences) > k
      if (end - start + 1 - maxCount > k) {
        c[s.charAt(start) - 'A']--;
        start++;
      }

      maxSize = Math.max(maxSize, end - start + 1);
    }

    return maxSize;
  }
}
