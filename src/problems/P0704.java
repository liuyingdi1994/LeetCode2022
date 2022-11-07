package problems;


public class P0704 {

    static class Solution {
        public int searchRecursiveHelper(int[] nums, int target, int low, int high) {
            if (low > high) {
                return -1;
            } else if (low == high) {
                return nums[low] == target ? low : -1;
            }
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                return searchRecursiveHelper(nums, target, low, mid - 1);
            } else if (nums[mid] < target) {
                return searchRecursiveHelper(nums, target, mid + 1, high);
            } else {
                return mid;
            }
        }

        public int search(int[] nums, int target) {
            return searchRecursiveHelper(nums, target, 0, nums.length - 1);
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.search(new int[]{2, 5}, 0));
    }
}

