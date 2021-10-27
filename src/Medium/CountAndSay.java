package Medium;

public class CountAndSay {
  // time: O(n?)
  // space: O(n)
  public String countAndSay(int n) {
    String s = "1";
    for (int i = 1; i < n; i++) {
      s = helper(s);
    }
    return s;
  }

  private String helper(String s) {
    StringBuilder str = new StringBuilder();
    int i = 0;
    while (i < s.length()) {
      int count = 1;
      while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
        count++;
        i++;
      }
      str.append(count);
      str.append(s.charAt(i));
      i++;
    }
    System.out.println(str.toString());
    return str.toString();
  }
}
