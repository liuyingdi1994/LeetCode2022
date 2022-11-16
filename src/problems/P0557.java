package problems;


public class P0557 {

    static class Solution {
        public String reverseWords(String s) {
            String ans = "";
            int index = 0;
            while (index < s.length()) {
                while (index < s.length() && s.charAt(index) == ' ') {
                    ans += ' ';
                    index += 1;
                }
                String word = "";
                while (index < s.length() && s.charAt(index) != ' ') {
                    word = s.charAt(index) + word;
                    index += 1;
                }
                ans += word;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

