package Easy;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes
 * the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInteger {
  // Time: O(n)
  // Space: O(n)
  public int reverse(int x) {
    try {
      String num = String.valueOf(x);
      String returnString;
      if(num.charAt(0) == '-') {
        returnString = "-";
      } else {
        returnString = "";
      }

      for(int i = num.length() - 1; i >= 0; i--) {
        if (num.charAt(i) == '-') {
          continue;
        }
        returnString = returnString + num.charAt(i);
      }
      int returnNum = Integer.valueOf(returnString);
      if (returnNum < -(Math.pow(2, 31)) || returnNum > (Math.pow(2, 31) - 1)) {
        return 0;
      }
      return returnNum;
    } catch(Exception e) {
      return 0;
    }
  }
}
