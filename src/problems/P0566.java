package problems;


public class P0566 {

    static class Solution {
        public int[][] matrixReshape(int[][] matrix, int r, int c) {
            if (matrix.length * matrix[0].length != r * c) {
                return matrix;
            }
            return covertTo2D(covertTo1D(matrix), r, c);
        }

        public int[] covertTo1D(int[][] matrix) {
            int[] ans = new int[matrix.length * matrix[0].length];
            int ansIndex = 0;
            for (int[] row : matrix) {
                for (int item : row) {
                    ans[ansIndex] = item;
                    ansIndex += 1;
                }
            }
            return ans;
        }

        public int[][] covertTo2D(int[] matrix, int row, int column) {
            int[][] ans = new int[row][column];
            int matrixIndex = 0;
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < column; c++) {
                    ans[r][c] = matrix[matrixIndex];
                    matrixIndex += 1;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

