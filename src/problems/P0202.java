package problems;


import java.util.HashSet;
import java.util.Set;

public class P0202 {

    static class Solution {
        public int calculate(int n) {
            if (n < 10) {
                return n * n;
            }
            return (n % 10) * (n % 10) + calculate(n / 10);
        }

        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet<>();
            while (!set.contains(n)) {
                if (n == 1) {
                    return true;
                }
                set.add(n);
                n = calculate(n);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        solve.isHappy(19);
    }
}

