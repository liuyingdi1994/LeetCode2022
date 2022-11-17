package problems;


public class P0206 {

    static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return null;
            } else if (head.next == null) {
                return head;
            } else {
                ListNode node = new ListNode(head.val);
                ListNode rest = reverseList(head.next);
                append(rest, node);
                return rest;
            }
        }

        public void append(ListNode head, ListNode node) {
            if (head != null) {
                ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

