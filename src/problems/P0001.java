package problems;


import java.util.HashMap;
import java.util.Map;

public class P0001 {

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int index = 0; index < nums.length; index++) {
                if (map.containsKey(target - nums[index])) {
                    return new int[]{map.get(target - nums[index]), index};
                } else {
                    map.put(nums[index], index);
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

