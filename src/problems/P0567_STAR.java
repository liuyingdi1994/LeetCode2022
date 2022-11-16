package problems;


import java.util.HashMap;
import java.util.Map;

public class P0567_STAR {

    static class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            Map<Character, Integer> map1 = convertStringToMap(s1);
            Map<Character, Integer> map2 = convertStringToMap(s2.substring(0, s1.length()));
            int left = 0, right = s1.length() - 1;
            // display(map1);
            while (true) {
                // System.out.print(left + ", " + right + "| ");
                // display(map2);
                if (map1.equals(map2)) {
                    return true;
                }
                char removeChar = s2.charAt(left);
                map2.put(removeChar, map2.get(removeChar) - 1);
                left += 1;

                right += 1;
                if (right == s2.length()) {
                    return false;
                }
                char appendChar = s2.charAt(right);
                map2.put(appendChar, map2.getOrDefault(appendChar, 0) + 1);
            }
        }

        public Map<Character, Integer> convertStringToMap(String str) {
            Map<Character, Integer> map = new HashMap<>();
            for (int letter = 'a'; letter <= 'z'; letter++) {
                map.put((char) letter, 0);
            }
            for (int index = 0; index < str.length(); index++) {
                char ch = str.charAt(index);
                map.put(ch, map.get(ch) + 1);
            }
            return map;
        }

        // public static void display(Map<Character, Integer> map) {
        //     for (Character ch : map.keySet()) {
        //         if (map.get(ch) > 0) {
        //             System.out.print(ch + ":" + map.get(ch) + ",");
        //         }
        //     }
        //     System.out.println();
        // }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.checkInclusion("ab", "eibdaooo"));
    }
}

