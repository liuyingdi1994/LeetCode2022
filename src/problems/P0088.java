package problems;


public class P0088 {

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int index1 = m - 1;
            int index2 = n - 1;
            int index3 = nums1.length - 1;
            while (index1 >= 0 && index2 >= 0) {
                if (nums1[index1] >= nums2[index2]) {
                    nums1[index3] = nums1[index1];
                    index1 -= 1;
                    index3 -= 1;
                } else {
                    nums1[index3] = nums2[index2];
                    index2 -= 1;
                    index3 -= 1;
                }
            }
            while (index2 >= 0) {
                nums1[index3] = nums2[index2];
                index2 -= 1;
                index3 -= 1;
            }
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

