package Medium;

import java.util.*;

public class DecodeString {
  public String decodeString(String s) {
    Deque<Character> stack = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ']') {
        List<Character> charList = new ArrayList<>();
        while(stack.peek() != '[') {
          charList.add(stack.pop());
        }
        stack.pop();
        StringBuilder digits = new StringBuilder();

        while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
          digits.append(stack.pop());
        }
        digits.reverse();
        int k = Integer.valueOf(digits.toString());
        while (k > 0) {
          for (int j = charList.size() - 1; j >= 0; j--) {
            stack.push(charList.get(j));
          }
          k--;
        }
      } else {
        stack.push(s.charAt(i));
      }
    }
    char[] result = new char[stack.size()];
    for (int i = result.length - 1; i >= 0; i--) {
      result[i] = stack.pop();
    }
    return new String(result);
  }
}
