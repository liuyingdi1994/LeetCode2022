package problems;


import java.util.HashMap;
import java.util.Map;

public class P0383 {

    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> map1 = convertStringToMap(ransomNote);
            Map<Character, Integer> map2 = convertStringToMap(magazine);
            for (char ch : map1.keySet()) {
                if (map1.get(ch) > map2.getOrDefault(ch, 0)) {
                    return false;
                }
            }
            return true;
        }

        public Map<Character, Integer> convertStringToMap(String str) {
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

