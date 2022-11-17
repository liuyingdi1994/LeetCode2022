package problems;


public class P0733 {

    static class Solution {
        public int[][] floodFill(int[][] image, int row, int column, int color) {
            helper(image, new boolean[image.length][image[0].length], row, column, image[row][column], color);
            return image;
        }

        public void helper(int[][] image, boolean[][] visited, int row, int column, int value, int color) {
            if (row >= 0 && row < image.length && column >= 0 && column < image[row].length && !visited[row][column] && image[row][column] == value) {
                visited[row][column] = true;
                image[row][column] = color;
                helper(image, visited, row - 1, column, value, color);
                helper(image, visited, row, column - 1, value, color);
                helper(image, visited, row + 1, column, value, color);
                helper(image, visited, row, column + 1, value, color);
            }
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        int[][] image = new int[][]{
                {0, 0, 0},
                {0, 0, 0}
        };
        solve.floodFill(image, 0, 0, 2);
        for (int[] line : image) {
            for (int item : line) {
                System.out.print(item + ", ");
            }
            System.out.println();
        }
    }
}

