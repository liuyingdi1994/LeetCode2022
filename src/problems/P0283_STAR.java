package problems;


import java.util.Arrays;

public class P0283_STAR {

    static class Solution {
        public void moveZeroes(int[] nums) {
            int low = 0;
            int high = 0;
            while (high < nums.length) {
                if (nums[high] != 0) {
                    nums[low] = nums[high];
                    low += 1;
                }
                high += 1;
            }
            for (; low < nums.length; low++) {
                nums[low] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        int[] items = {0, 1, 0, 3, 12};
        solve.moveZeroes(items);
        System.out.println(Arrays.toString(items));
    }
}

