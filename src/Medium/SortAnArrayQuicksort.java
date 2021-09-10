package Medium;

/**
 * Given an array of integers nums, sort the array in ascending order.
 * (USING QUICKSORT)
 */
public class SortAnArrayQuicksort {
  public int[] sortArray(int[] nums) {
    quicksort(nums, 0, nums.length - 1);
    return nums;
  }

  public void quicksort(int[] arr, int lo, int hi) {
    if (lo < hi) {
      int pi = partition(arr, lo, hi);
      quicksort(arr, lo, pi - 1);
      quicksort(arr, pi + 1, hi);
    }

  }

  public int partition(int[] arr, int lo, int hi) {
    int pivot = arr[hi];
    int i = lo - 1;
    for (int j = lo; j <= hi - 1; j++) {
      if (arr[j] < pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, hi);
    return (i + 1);
  }

  public void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
