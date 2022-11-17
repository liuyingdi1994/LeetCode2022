package problems;


import java.util.Arrays;

public class P1502 {

    static class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            if (arr.length < 3) {
                return true;
            }
            Arrays.sort(arr);
            int diff = arr[1] - arr[0];
            for (int index = 2; index < arr.length; index++) {
                if (arr[index] - arr[index - 1] != diff) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

