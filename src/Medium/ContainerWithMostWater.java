package Medium;

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate
 * (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and
 * (i, 0). Find two lines, which, together with the x-axis forms a container, such that the
 * container contains the most water.
 */


public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int left = 0, right = height.length - 1;
    int maxArea = 0;

    while (left < right) {
      maxArea = Math.max(maxArea, Math.min(height[left], height[right])
          * (right - left));
      if (height[left] < height[right])
        left++;
      else
        right--;
    }

    return maxArea;
  }



  /*
  public int maxArea(int[] height) {
    int maxWater = 0;
    for (int i = 0; i < height.length - 1; i++) {
      for (int j = 0; j < height.length; j++) {
        int water;
        if (height[i] < height[j]) {
          water = height[i] * (j - i);
        } else {
          water = height[j] * (j - i);
        }
        if (water > maxWater) {
          maxWater = water;
        }
      }
    }
    return maxWater;
  }

 */
}