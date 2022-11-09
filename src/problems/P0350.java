package problems;


import java.util.*;

public class P0350 {

    static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map1 = covertArrayToMap(nums1);
            Map<Integer, Integer> map2 = covertArrayToMap(nums2);
            int[] ans = new int[nums1.length + nums2.length];
            int ansIndex = 0;
            for (int item : map1.keySet()) {
                if (map2.containsKey(item)) {
                    int minCount = Math.min(map1.get(item), map2.get(item));
                    for (int count = 0; count < minCount; count++) {
                        ans[ansIndex] = item;
                        ansIndex += 1;
                    }
                }
            }
            return Arrays.copyOfRange(ans, 0, ansIndex);
        }

        public Map<Integer, Integer> covertArrayToMap(int[] items) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int item : items) {
                if (map.containsKey(item)) {
                    map.put(item, map.get(item) + 1);
                } else {
                    map.put(item, 1);
                }
            }
            return map;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(solve.intersect(nums1, nums2)));
    }
}

