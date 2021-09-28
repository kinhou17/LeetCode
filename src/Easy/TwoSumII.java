package Easy;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= first < second <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 */
public class TwoSumII {
  public int[] twoSum(int[] numbers, int target) {
    int j = numbers.length - 1;
    int i = 0;
    while(j >= i) {
      if (numbers[j] + numbers[i] == target) {
        return new int[]{i +1, j +1};
      } else if (numbers[j] + numbers[i] > target) {
        j--;
      } else {
        i++;
      }
    }
    return null;
  }
}
