package Easy;

/**
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger {
  public int romanToInt(String s) {
    // Time: O(n) or O(1) (less than 15 input string)
    // Space: O(n)
    int total = 0;
    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      if (curr == 'I') {
        if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
          total -= 1;
        } else {
          total += 1;
        }
      } else if (curr == 'X') {
        if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
          total -= 10;
        } else {
          total += 10;
        }
      } else if (curr == 'C') {
        if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
          total -= 100;
        } else {
          total += 100;
        }
      } else if (curr == 'V') {
        total += 5;
      } else if (curr == 'L') {
        total += 50;
      } else if (curr == 'D') {
        total += 500;
      } else if (curr == 'M') {
        total += 1000;
      }
    }
    return total;
  }
}
