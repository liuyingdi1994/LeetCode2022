package problems;


public class P0167 {

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int low = 0;
            int high = numbers.length - 1;
            while (low < high) {
                if (numbers[low] + numbers[high] < target) {
                    low += 1;
                } else if (numbers[low] + numbers[high] > target) {
                    high -= 1;
                } else {
                    return new int[]{low + 1, high + 1};
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

