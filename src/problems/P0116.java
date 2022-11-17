package problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P0116 {
    private static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    static class Solution {
        public Node connect(Node root) {
            List<Node> nodes = bfs(root);
            int count = 1;
            for (int index = 1; index <= nodes.size(); index++) {
                Node node = nodes.get(index - 1);
                if (index < count && index < nodes.size()) {
                    node.next = nodes.get(index);
                } else {
                    count = count * 2 + 1;
                }
            }
            return root;
        }

        public List<Node> bfs(Node node) {
            List<Node> nodes = new ArrayList<>();
            if (node == null) {
                return nodes;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            while (!queue.isEmpty()) {
                Node first = queue.remove();
                nodes.add(first);
                if (first.left != null) {
                    queue.add(first.left);
                }
                if (first.right != null) {
                    queue.add(first.right);
                }
            }
            return nodes;
        }
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        Node root = new Node(
                1,
                new Node(
                        2, new Node(4), new Node(5), null
                ),
                new Node(
                        3, new Node(6), new Node(7), null
                ),
                null
        );
    }
}
