package problems;


public class P0695 {

    static class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int maxArea = 0;
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            for (int row = 0; row < grid.length; row++) {
                for (int column = 0; column < grid[0].length; column++) {
                    if (!visited[row][column] && grid[row][column] == 1) {
                        maxArea = Math.max(maxArea, count(grid, visited, row, column));
                    }
                }
            }
            return maxArea;
        }

        public int count(int[][] grid, boolean[][] visited, int row, int column) {
            if (row >= 0 && row < grid.length && column >= 0 && column < grid[row].length && !visited[row][column] && grid[row][column] == 1) {
                visited[row][column] = true;
                return 1 + count(grid, visited, row - 1, column)
                        + count(grid, visited, row, column - 1)
                        + count(grid, visited, row + 1, column)
                        + count(grid, visited, row, column + 1);
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}
