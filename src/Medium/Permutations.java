package Medium;

import java.util.*;

public class Permutations {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> output = new LinkedList();

    ArrayList<Integer> nums_1st = new ArrayList<Integer>();
    for (int num : nums) {
      nums_1st.add(num);
    }
    int n = nums.length;
    backtrack(n, nums_1st, output, 0);
    return output;
  }

  public void backtrack(int n, ArrayList<Integer> nums, List<List<Integer>> output, int first) {
    if (first == n) output.add(new ArrayList<Integer>(nums));

    for (int i = first; i < n; i++) {
      Collections.swap(nums, first, i);
      backtrack(n, nums, output, first + 1);
      Collections.swap(nums, first, i);
    }
  }


  /*
      public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
   */
}
