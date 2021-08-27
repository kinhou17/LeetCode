package Medium;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according
 * to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoku {

  private static final int BOARD_SIZE = 9;

  public boolean isValidSudoku(char[][] board) {
    HashMap<Integer, HashSet<Character>> rows = initMap(new HashMap<>());
    HashMap<Integer, HashSet<Character>> cols = initMap(new HashMap<>());
    HashMap<Integer, HashSet<Character>> boxes = initMap(new HashMap<>());

    for (int row = 0; row < BOARD_SIZE; row++) {
      for (int col = 0; col < BOARD_SIZE; col++) {
        int box = getBoxNum(row, col);
        Character c = board[row][col];
        if (c == '.') {
          continue;
        }
        HashSet<Character> rowSet = rows.get(row);
        HashSet<Character> colSet = cols.get(col);
        HashSet<Character> boxSet = boxes.get(box);

        if (rowSet.contains(c) || colSet.contains(c) || boxSet.contains(c)) {
          return false;
        }

        rowSet.add(c);
        colSet.add(c);
        boxSet.add(c);
      }

    }

    return true;
  }

  private static int getBoxNum(int row, int col) {
    return (row / 3) + 3 * (col / 3);
  }

  private static HashMap<Integer, HashSet<Character>> initMap(HashMap<Integer, HashSet<Character>> map) {
    for (int i = 0; i < BOARD_SIZE; i++) {
      map.put(i, new HashSet<>());
    }
    return map;
  }
}
