package Hard;
/**
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 *
 * You have the following three operations permitted on a word:
 *
 * Insert a character
 * Delete a character
 * Replace a character
 */

import java.util.HashMap;
import java.util.HashSet;

public class EditDistanceINCOMPLETE {
  public int minDistance(String word1, String word2) {
    int count = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < word1.length(); i++) {
      map.put(Character.valueOf(word1.charAt(i)), i);
    }
    for (int i = 0; i < word2.length(); i++) {
      if (map.put(Character.valueOf(word1.charAt(i)), i) != i || map.put(Character.valueOf(word1.charAt(i)), i) != null) {
        count++;
      }
    }
    return count;
  }

}
