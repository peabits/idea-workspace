package chapter2.issue3.solution;

public class RemoveMidNode {

    private static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public RemoveMidNode(int[] arr) {
        BuildLinkedList(arr);
    }

    private void BuildLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        Node preNode = this.head = new Node(arr[0]);
        for (int i = 1; i < arr.length; ++i) {
            preNode = preNode.next = new Node(arr[i]);
        }
    }

    public void removeMidNode() {
        if (this.head == null || this.head.next == null) {
            return;
        }
        if (this.head.next.next == null) {
            this.head = this.head.next;
        }
        Node curNode = this.head.next.next;
        Node preNode = this.head;
        while (curNode.next != null && curNode.next.next != null) {
            preNode = preNode.next;
            curNode = curNode.next.next;
        }
        preNode.next = preNode.next.next;
    }

}
