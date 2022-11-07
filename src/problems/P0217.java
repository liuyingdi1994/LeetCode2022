package problems;

import java.util.HashSet;
import java.util.Set;


public class P0217 {
    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true;
                } else {
                    set.add(num);
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}
