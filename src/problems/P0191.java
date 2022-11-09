package problems;


public class P0191 {

    static public class Solution {
        public int hammingWeight(int n) {
            String str = Integer.toBinaryString(n);
            int count = 0;
            for (int index = 0; index < str.length(); index++) {
                count += str.charAt(index) - 48;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.hammingWeight(0b11111111111111111111111111111101));
    }
}

