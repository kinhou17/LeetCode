package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Given a string array words, return an array of all characters that show up in all strings
 * within the words (including duplicates). You may return the answer in any order.
 */
public class FindCommonCharactersINCOMPLETE {
  public List<String> commonChars(String[] words) {
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (String word : words) {
      for (int j = 0; j < word.length(); j++) {
        HashSet<Character> charsInWord = new HashSet<>();
        Character currChar = Character.valueOf(word.charAt(j));
        if (charsInWord.add(currChar)) {
          if (charCount.containsKey(currChar)) {
            charCount.put(currChar, charCount.get(currChar) + 1);
          } else {
            charCount.put(currChar, 1);
          }
        }
      }
    }
    List<String> returnList = new ArrayList<>();
    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
      int count = entry.getValue() % words.length;
      if (count == 0) {
        int i = entry.getValue() / words.length; // doesn't work for ["cool","lock","cook"]
        while(i > 0) {
          returnList.add(entry.getKey().toString());
          i--;
        }
      }
    }
    return returnList;
  }

}
