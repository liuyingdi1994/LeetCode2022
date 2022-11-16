package problems;


import java.util.HashSet;
import java.util.Set;

public class P0036 {

    static class Solution {
        public boolean isValidSudoku(char[][] board) {
            // System.out.println(checkColumn(board));
            return checkRow(board) && checkColumn(board) && checkCell(board);
        }

        public boolean checkRow(char[][] board) {
            for (int r = 0; r < 9; r++) {
                Set<Character> set = new HashSet<>();
                for (int c = 0; c < 9; c++) {
                    char ch = board[r][c];
                    if (ch != '.') {
                        if (set.contains(ch)) {
                            System.out.println(r + ", " + c);
                            return false;
                        }
                        set.add(ch);
                    }
                }
            }
            return true;
        }

        public boolean checkColumn(char[][] board) {
            for (int c = 0; c < 9; c++) {
                Set<Character> set = new HashSet<>();
                for (int r = 0; r < 9; r++) {
                    char ch = board[r][c];
                    if (ch != '.') {
                        if (set.contains(ch)) {
                            return false;
                        }
                        set.add(ch);
                    }
                }
            }
            return true;
        }

        public boolean checkCell(char[][] board) {
            for (int blockRow = 0; blockRow < 3; blockRow++) {
                for (int blockColumn = 0; blockColumn < 3; blockColumn++) {
                    Set<Character> set = new HashSet<>();
                    for (int r = 0; r < 3; r++) {
                        for (int c = 0; c < 3; c++) {
                            char ch = board[blockRow * 3 + r][blockColumn * 3 + c];
                            if (ch != '.') {
                                if (set.contains(ch)) {
                                    return false;
                                }
                                set.add(ch);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        solve.isValidSudoku(new char[][]{
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        });
    }
}

