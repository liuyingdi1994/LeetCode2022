package problems;


public class P1822 {

    static class Solution {
        public int arraySign(int[] nums) {
            int count1 = 0, count2 = 0;
            for (int num : nums) {
                if (num == 0) {
                    return 0;
                } else if (num < 0) {
                    count1 += 1;
                } else {
                    count2 += 1;
                }
            }
            return count1 % 2 == 0 ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

