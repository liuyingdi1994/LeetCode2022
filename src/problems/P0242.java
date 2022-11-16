package problems;


import java.util.HashMap;
import java.util.Map;

public class P0242 {

    static class Solution {
        public boolean isAnagram(String s, String t) {
            return convert(s).equals(convert(t));
        }

        public Map<Character, Integer> convert(String str) {
            Map<Character, Integer> map = new HashMap<>();
            for (int index = 0; index < str.length(); index++) {
                char ch = str.charAt(index);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            return map;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

