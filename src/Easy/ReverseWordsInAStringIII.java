package Easy;

public class ReverseWordsInAStringIII {
  public String reverseWords(String string) {

    char[] s = string.toCharArray();
    int j = 0;
    for (int i = 0; i < s.length; i++) {
      if (s[i] == ' ') {
        reverseSection(s, i - j, i - 1);
        j = 0;
      } else {
        j++;
      }
    }
    reverseSection(s, s.length - j, s.length - 1);
    return String.valueOf(s);
  }


  private void reverseSection(char[] s, int start, int end) {
    while (end >= start) {
      char temp = s[start];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }
  }
}
