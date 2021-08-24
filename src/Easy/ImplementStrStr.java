package Easy;

/**
 *
 Implement strStr().

 Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 Clarification:

 What should we return when needle is an empty string? This is a great question to ask during an interview.

 For the purpose of this problem, we will return 0 when needle is an empty string.
 This is consistent to C's strstr() and Java's indexOf().
 */
public class ImplementStrStr {
  public int strStr(String haystack, String needle) {
    for (int i = 0; ; i++) {
      for (int j = 0; ; j++) {
        if (j == needle.length()) {
          return i;
        }
        if (i + j == haystack.length()) {
          return -1;
        }
        if (needle.charAt(j) != haystack.charAt(i + j)) {
          break;
        }
      }
    }
  }
    /*
    if (needle == "") {
      return -1;
    }
    for (int i = 0; i < haystack.length(); i++) {
      if (haystack.charAt(i) == needle.charAt(0) {
        int j = 0;
        while (i + j < haystack.length() && haystack.charAt(i +j) == needle.charAt(j) {
          j++;
        }
        if (j == needle.length() - 1) {
          return i;
        }
      }
    }
    return -1;
  }

     */
}
