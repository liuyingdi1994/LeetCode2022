package problems;


public class P0344 {

    static class Solution {
        public void reverseString(char[] s) {
            for (int index = 0; index < s.length / 2; index++) {
                char temp = s[index];
                s[index] = s[s.length - 1 - index];
                s[s.length - 1 - index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

