package chapter2.issue5.solution;

public class ReversePartLinkedList {

    private static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public ReversePartLinkedList(int[] arr) {
        buildSingleLinkedList(arr);
    }

    private void buildSingleLinkedList(int[] arr) {
        if (arr != null && arr.length != 0) {
            Node preNode = this.head = new Node(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                preNode = preNode.next = new Node(arr[i]);
            }
        }
    }

    public void reversePartLinkedList(int from, int to) {
        if (from >= to || from < 1) {
            return;
        }
        if (this.head == null || this.head.next == null) {
            return;
        }
        int len = 1;
        Node curNode = this.head;
        Node fPreNode = null;
        Node tPosNode = null;
        while (curNode != null) {
            ++len;
            fPreNode = (len == from - 1) ? curNode : fPreNode;
            tPosNode = (len == to + 1) ? curNode : tPosNode;
            curNode = curNode.next;
        }
        if (to > len) {
            return;
        }
        curNode = (fPreNode == null) ? this.head : fPreNode.next;
        Node postNode = curNode.next;
        curNode.next = tPosNode;
        Node nextNode = null;
        while (nextNode != tPosNode) {
            nextNode = postNode.next;
            postNode.next = curNode;
            curNode = postNode;
            postNode = nextNode;
        }
        if (fPreNode != null) {
            fPreNode.next = curNode;
        }
    }

}
