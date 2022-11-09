package problems;


public class P1779 {

    static class Solution {
        public int nearestValidPoint(int x, int y, int[][] points) {
            int minDistance = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int index = 0; index < points.length; index++) {
                if (x == points[index][0] || y == points[index][1]) {
                    int dist = distance(x, y, points[index]);
                    if (dist < minDistance) {
                        minDistance = dist;
                        minIndex = index;
                    }
                }
            }
            return minIndex;
        }

        public int distance(int x, int y, int[] point) {
            return Math.abs(x - point[0]) + Math.abs(y - point[1]);
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

