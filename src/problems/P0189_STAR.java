package problems;


public class P0189_STAR {

    static class Solution {
        public void rotate(int[] items, int k) {
            k %= items.length;
            if (k == 0) {
                return;
            }
            reverse(items, 0, items.length - 1);
            reverse(items, 0, k - 1);
            reverse(items, k, items.length - 1);
        }

        public void reverse(int[] items, int low, int high) {
            for (int index = low; index <= (low + high) / 2; index++) {
                int temp = items[index];
                items[index] = items[low + high - index];
                items[low + high - index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        int[] items = {1, 2, 3, 4, 5, 6, 7};
        solve.rotate(items, 3);
    }
}

