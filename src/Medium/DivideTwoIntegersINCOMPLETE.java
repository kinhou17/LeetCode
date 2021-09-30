package Medium;

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
 *
 * Return the quotient after dividing dividend by divisor.
 *
 * The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.
 *
 * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, assume that your function returns 231 − 1 when the division result overflows.
 */
public class DivideTwoIntegersINCOMPLETE {
  public int divide(int dividend, int divisor) {
    try {
      boolean pos = true;
      if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
        pos = false;
      }
      int result = 0;

      if (dividend < 0 && divisor < 0) {
        while(dividend <= 0) {
          result += 1;
          dividend = dividend - divisor;
        }
      } else if(pos) { // both pos
        while(dividend >= 0) {
          result += 1;
          dividend = dividend - divisor;
        }
      } else if (!pos && dividend > 0){ // pos dividend, neg divisor
        while (dividend >= 0) {
          result -= 1;
          dividend = dividend + divisor;
        }
      } else { // neg dividend, pos divisor
        while (dividend <= 0) {
          result -= 1;
          dividend = dividend + divisor;
        }
      }
      if(pos) {
        if (result > Integer.MAX_VALUE) {
          throw new Exception();
        }
        return result - 1;
      } else {
        if (result <= Integer.MIN_VALUE) {
          throw new Exception();
        }
        return result + 1;
      }
    } catch(Exception e) {
      return ((int)Math.pow(2, 31));
    }
  }
}
