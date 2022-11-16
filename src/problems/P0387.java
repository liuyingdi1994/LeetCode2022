package problems;


import java.util.HashMap;
import java.util.Map;

public class P0387 {

    static class Solution {
        public int firstUniqChar(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (int index = 0; index < s.length(); index++) {
                char ch = s.charAt(index);
                if (map.containsKey(ch)) {
                    map.put(ch, Integer.MAX_VALUE);
                } else {
                    map.put(ch, index);
                }
            }
            int minIndex = Integer.MAX_VALUE;
            for (char ch : map.keySet()) {
                minIndex = Math.min(minIndex, map.get(ch));
            }
            return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

