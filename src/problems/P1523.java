package problems;


public class P1523 {

    static class Solution {
        public int countOdds(int low, int high) {
            if (low % 2 == 1) {
                low += 1;
            }
            if (high % 2 == 1) {
                high -= 1;
            }
            return (high - low) / 2 + 1;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.countOdds(3, 7));
    }
}

