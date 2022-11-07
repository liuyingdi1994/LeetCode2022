package problems;


public class P0035 {

    static class Solution {
        public int recursiveSearchInsert(int[] nums, int target, int low, int high) {
            int mid = (low + high) / 2;
            if (target < nums[mid]) {
                if (low == mid) {
                    return low;
                }
                return recursiveSearchInsert(nums, target, low, mid - 1);
            } else if (target > nums[mid]) {
                if (high == mid) {
                    return high + 1;
                }
                return recursiveSearchInsert(nums, target, mid + 1, high);
            } else {
                return mid;
            }
        }

        public int searchInsert(int[] nums, int target) {
            return recursiveSearchInsert(nums, target, 0, nums.length - 1);
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.searchInsert(new int[]{1, 3, 5, 7}, 0));
    }
}

