package problems;


import java.util.HashSet;
import java.util.Set;

public class P0073 {

    static class Solution {
        public void setZeroes(int[][] matrix) {
            Set<Integer> rows = new HashSet<>();
            Set<Integer> columns = new HashSet<>();
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                    if (matrix[r][c] == 0) {
                        rows.add(r);
                        columns.add(c);
                    }
                }
            }

            for (int r = 0; r < matrix.length; r++) {
                if (rows.contains(r)) {
                    for (int c = 0; c < matrix[r].length; c++) {
                        matrix[r][c] = 0;
                    }
                }
            }

            for (int c = 0; c < matrix[0].length; c++) {
                if (columns.contains(c)) {
                    for (int r = 0; r < matrix.length; r++) {
                        matrix[r][c] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

