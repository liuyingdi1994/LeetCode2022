package problems;


import java.util.ArrayList;
import java.util.List;

public class P0118 {

    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>();
            for (int row = 0; row < numRows; row++) {
                List<Integer> numbers = new ArrayList<>();
                for (int column = 0; column <= row; column++) {
                    if (column == 0 || column == row) {
                        numbers.add(1);
                    } else {
                        List<Integer> lastNumbers = ans.get(row - 1);
                        numbers.add(lastNumbers.get(column - 1) + lastNumbers.get(column));
                    }
                }
                ans.add(numbers);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

