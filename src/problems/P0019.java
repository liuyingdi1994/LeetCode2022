package problems;


public class P0019 {

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int target = size(head) - n;
            if (target == 0) {
                return head.next;
            } else {
                ListNode preNode = get(head, target - 1);
                preNode.next = preNode.next.next;
                return head;
            }
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

