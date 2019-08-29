package chapter2.issue4.solution;

public class ReverseSingleLinkedList {

    private static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public ReverseSingleLinkedList(int[] arr) {
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

    public void reverseSingleLinkedList() {
        if (this.head == null || this.head.next == null) {
            return;
        }
        Node preNode = null;
        Node curNode = null;
        while (this.head != null) {
            curNode = this.head.next;
            this.head.next = preNode;
            preNode = this.head;
            this.head = curNode;
        }
        this.head = preNode;
//        Node pre = null;
//        Node cur = head;
//        Node post = head.next;
//        while (post != null) {
//            cur.next = pre;
//            pre = cur;
//            cur = post;
//            post = post.next;
//        }
//        cur.next = pre;
//        head = cur;
    }

}
