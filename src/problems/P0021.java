package problems;


public class P0021 {

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) {
                return list2;
            } else if (list2 == null) {
                return list1;
            } else {
                ListNode head = new ListNode();
                if (list1.val <= list2.val) {
                    head.val = list1.val;
                    head.next = mergeTwoLists(list1.next, list2);
                } else {
                    head.val = list2.val;
                    head.next = mergeTwoLists(list1, list2.next);
                }
                return head;
            }
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

