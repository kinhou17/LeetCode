package Hard;

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
