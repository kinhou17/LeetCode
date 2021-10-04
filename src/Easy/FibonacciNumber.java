package Easy;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n)
 */
public class FibonacciNumber {
  // time: O(n)
  // space: O(1)
  public int fib(int n) {
    // edge cases
    if (n == 0) return 0;
    if (n == 1) return 1;
    //define first and second
    int first = 0;
    int second = 1;
    // iterate through fibonacci
    for (int i = 2; i <= n; i++) {
      int third = first + second;
      first = second;
      second = third;
    }
    // return
    return second;
  }
}
