package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 *
 */
public class GroupAnagrams {
  // strs = ["eat", "tea", "tan"]
  // sort words: "eat" -> "aet"
  // sort "tea": -> "aet"
  // "aet" == "aet" -> (eat, tea)
  public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> groups = new ArrayList<List<String>>();

    //handle base cases
    if (strs == null || strs.length == 0) {
      return groups;
    }
    // crux of the algorithm

    // algorithm overview: two words are anagrams when the sorted version of them is the same
    // they will then end up in the same group

    // Insight: Usually when the question asks for anagrams in a list its begging for hashmaps

    HashMap<String, List<String>> sortedGroups = new HashMap<>();
    for (String str : strs) {
      char[] ch = str.toCharArray();
      Arrays.sort(ch);
      String key = String.valueOf(ch);
      if (!sortedGroups.containsKey(key)) {
        sortedGroups.put(key, new ArrayList<>());
      }
      sortedGroups.get(key).add(str);
    }
    for (List<String> list : sortedGroups.values()) {
      // for (Map.Entry<String, List<String>> entry : sortedGroups.entrySet()) {
      //   groups.add(entry.getValue());
      groups.add(list);
    }
    return groups;
  }
}
