package problems;


import java.util.HashMap;
import java.util.Map;

public class P0003_STAR {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int left = 0, right = 0, maxLength = 0;
            Map<Character, Integer> map = new HashMap<>();
            while (right < s.length()) {
                // System.out.print(String.format("%d, %d, %d --> ", left, right, maxLength));
                char ch = s.charAt(right);
                int index = map.getOrDefault(ch, -1);
                if (index != -1 && index >= left) {
                    maxLength = Math.max(maxLength, right - left);
                    left = index + 1;
                }
                map.put(ch, right);
                right += 1;
                // System.out.println(String.format("%d, %d, %d", left, right, maxLength));
            }
            maxLength = Math.max(maxLength, right - left);
            return maxLength;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.lengthOfLongestSubstring("abba"));
    }


}

