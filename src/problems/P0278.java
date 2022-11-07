package problems;


public class P0278 {

    static class VersionControl {
        boolean isBadVersion(int version) {
            return false;
        }
    }

    static class Solution extends VersionControl {
        public int recursiveFirstBadVersion(int low, int high) {
            if (low == high) {
                return low;
            }
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                return recursiveFirstBadVersion(low, mid);
            } else {
                return recursiveFirstBadVersion(mid + 1, high);
            }
        }

        public int firstBadVersion(int n) {
            return recursiveFirstBadVersion(1, n);
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.firstBadVersion(5));
    }
}

