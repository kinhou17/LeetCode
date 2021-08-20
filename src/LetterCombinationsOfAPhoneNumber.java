/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations
 * that the number could represent. Return the answer in any order.
 */

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
  public List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    if (digits.isEmpty()) {
      return ans;
    }
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for (int i = 0; i < digits.length(); i++) {
      int x = Character.getNumericValue(digits.charAt(i));
      while (ans.peek().length() == i) { // fills the queue with digits of i+1 length.
        String t = ans.remove();
        for (char s : mapping[x].toCharArray()) {
          ans.add(t + s);
        }
      }
    }
    return ans;
  }


  }
