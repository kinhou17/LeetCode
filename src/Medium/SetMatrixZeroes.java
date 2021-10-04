package Medium;

/**
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's,
 * and return the matrix.
 *
 * You must do it in place.
 */
public class SetMatrixZeroes {
  // Time: O(n^2)
  // Space: O(n)
  public void setZeroes(int[][] matrix) {
    // set bools for if zero rows are affected
    boolean row0 = false;
    boolean col0 = false;
    // iterate matrix, store in column and row 0 if there is aero in row, col
    for (int i = 0; i < matrix.length; ++i) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
          if (i == 0) {
            row0 = true;
          }
          if (j == 0) {
            col0 = true;
          }
        }
      }
    }
    // set rows and cols to zero
    for (int i = 1; i < matrix.length; ++i) {
      for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    // set row 0 to 0s
    if (row0) {
      for (int j = 1; j < matrix[0].length; j++) {
        matrix[0][j] = 0;
      }
    }
    // set col 0 to 0s
    if (col0) {
      for (int i = 1; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }
    }
  }
}
