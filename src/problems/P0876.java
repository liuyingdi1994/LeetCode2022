package problems;

public class P0876 {

    static class Solution {
        public ListNode middleNode(ListNode head) {
            int size = size(head);
            int mid = size / 2;
            return get(head, mid);
        }

        public int size(ListNode head) {
            if (head == null) {
                return 0;
            }
            return 1 + size(head.next);
        }

        public ListNode get(ListNode head, int target) {
            if (target == 0) {
                return head;
            }
            return get(head.next, target - 1);
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

