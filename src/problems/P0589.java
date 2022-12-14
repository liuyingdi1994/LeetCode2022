package problems;


import java.util.ArrayList;
import java.util.List;

public class P0589 {

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    static class Solution {
        public List<Integer> preorder(Node root) {
            List<Integer> ans = new ArrayList<>();
            if (root != null) {
                ans.add(root.val);
                for (Node child : root.children) {
                    ans.addAll(preorder(child));
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
    }
}

