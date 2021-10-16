package Easy;

public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    // Time: O(n)
    // Space: O(n) -- reduce without using char array
    s = s.toLowerCase();
    char[] c = s.toCharArray();
    int start = 0;
    int end = c.length - 1;
    while(start <= end) {
      if(!Character.isLetterOrDigit(c[start])) {
        start++;
        continue;
      }
      if(!Character.isLetterOrDigit(c[end])) {
        end--;
        continue;
      }
      if(c[start] != c[end]) return false;
      start++;
      end--;
    }

    return true;
  }
}
