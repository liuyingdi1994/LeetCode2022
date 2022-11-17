package problems;


import java.util.ArrayList;
import java.util.List;

public class P1790 {

    static class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            if (s1.equals(s2)) {
                return true;
            }
            List<Integer> list = new ArrayList<>();
            for (int index = 0; index < s1.length(); index++) {
                if (s1.charAt(index) != s2.charAt(index)) {
                    list.add(index);
                }
            }
            if (list.size() != 2) {
                return false;
            }
            return s1.charAt(list.get(0)) == s2.charAt(list.get(1)) && s1.charAt(list.get(1)) == s2.charAt(list.get(0));
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

