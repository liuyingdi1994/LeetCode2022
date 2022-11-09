package problems;


public class P0997 {

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int targetIndex = 0;
            for (int index = 0; index < nums.length; index++) {
                if (Math.abs(nums[index]) < Math.abs(nums[targetIndex])) {
                    targetIndex = index;
                }
            }
            int left = targetIndex;
            int right = targetIndex + 1;
            int[] ans = new int[nums.length];
            int ansIndex = 0;
            while (left >= 0 && right < nums.length) {
                if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                    ans[ansIndex] = (int) Math.pow(nums[left], 2);
                    left -= 1;
                } else {
                    ans[ansIndex] = (int) Math.pow(nums[right], 2);
                    right += 1;
                }
                ansIndex += 1;
            }
            while (left >= 0) {
                ans[ansIndex] = (int) Math.pow(nums[left], 2);
                left -= 1;
                ansIndex += 1;
            }
            while (right < nums.length) {
                ans[ansIndex] = (int) Math.pow(nums[right], 2);
                right += 1;
                ansIndex += 1;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

