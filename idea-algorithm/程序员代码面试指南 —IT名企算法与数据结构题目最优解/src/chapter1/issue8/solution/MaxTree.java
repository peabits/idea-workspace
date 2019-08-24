package chapter1.issue8.solution;

import java.util.HashMap;
import java.util.Stack;

public class MaxTree {

    private static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int data) {
            this.value = data;
        }
    }

    private int[] arr;
    private Node maxTree;

    public MaxTree() {
    }

    public MaxTree(int[] arr) {
        this.arr = arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
        build();
    }

    public Node getMaxTree() {
        if (this.maxTree == null) {
            build();
        }
        return this.maxTree;
    }

    private void build() {
        if (this.arr == null || this.arr.length == 0) {
            return;
        }
        Node[] nodes = new Node[this.arr.length];
        for (int i = 0; i < this.arr.length; ++i) {
            nodes[i] = new Node(this.arr[i]);
        }
        Stack<Node> stack = new Stack<>();
        HashMap<Node, Node> lBigMap = new HashMap<>();
        HashMap<Node, Node> rBigMap = new HashMap<>();

        for (int i = 0; i < nodes.length; ++i) {
            Node cur = nodes[i];
            while ((!stack.isEmpty()) && stack.peek().value < cur.value) {
                popStackSetMap(stack, lBigMap);
            }
            stack.push(cur);
        }
        while (!stack.isEmpty()) {
            popStackSetMap(stack, lBigMap);
        }
        for (int i = nodes.length - 1; i >= 0; --i) {
            Node cur = nodes[i];
            while ((!stack.isEmpty()) && stack.peek().value < cur.value) {
                popStackSetMap(stack, rBigMap);
            }
            stack.push(cur);

        }
        while (!stack.isEmpty()) {
            popStackSetMap(stack, rBigMap);
        }
        Node head = null;
        for (int i = 0; i < nodes.length; ++i) {
            Node cur = nodes[i];
            Node left = lBigMap.get(cur);
            Node right = rBigMap.get(cur);
            if (left == null && right == null) {
                this.maxTree = cur;
            } else if (left == null) {
                if (right.left == null) {
                    right.left = cur;
                } else {
                    right.right = cur;
                }
            } else if (right == null) {
                if (left.left == null) {
                    left.left = cur;
                } else {
                    left.right = cur;
                }
            } else {
                Node parent = left.value < right.value ? left : right;
                if (parent.left == null) {
                    parent.left = cur;
                } else {
                    parent.right = cur;
                }
            }
        }
    }

    private void popStackSetMap(Stack<Node> stack, HashMap<Node, Node> map) {
        Node pop = stack.pop();
        if (stack.isEmpty()) {
            map.put(pop, null);
        } else {
            map.put(pop, stack.peek());
        }
    }

}
