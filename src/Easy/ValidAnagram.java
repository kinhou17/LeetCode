package Easy;

import java.util.Arrays;

public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    char[] c = s.toCharArray();
    char[] d = t.toCharArray();
    Arrays.sort(c);
    Arrays.sort(d);

    if (Arrays.equals(c, d)) {
      return true;
    }

    return false;
  }
}
