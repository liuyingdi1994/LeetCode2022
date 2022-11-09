package problems;


public class P0121_STAR {

    static class Solution {
        public int maxProfit(int[] prices) {
            int maxValue = 0;
            int minValue = Integer.MAX_VALUE;
            for (int price : prices) {
                minValue = Math.min(minValue, price);
                maxValue = Math.max(maxValue, price - minValue);
            }
            return maxValue;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

