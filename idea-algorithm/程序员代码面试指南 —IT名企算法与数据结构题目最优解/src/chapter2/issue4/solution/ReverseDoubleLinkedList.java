package chapter2.issue4.solution;

public class ReverseDoubleLinkedList {

    private static class Node {
        public int value;

        public Node last;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public ReverseDoubleLinkedList(int[] arr) {
        buildDoubleLinkedList(arr);
    }

    private void buildDoubleLinkedList(int[] arr) {
        if (arr != null && arr.length != 0) {
            Node preNode = this.head = new Node(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                preNode.next = new Node(arr[i]);
                preNode.next.last = preNode;
                preNode = preNode.next;
            }
        }
    }

    public void reverseDoubleLinkedList() {
        if (this.head == null || this.head.next == null) {
            return;
        }
        Node preNode = null;
        Node curNode = null;
        while (this.head != null) {
            curNode = this.head.next;
            this.head.next = preNode;
            this.head.last = curNode;
            preNode = this.head;
            this.head = curNode;
        }
        this.head = preNode;

//        Node cur = head;
//        Node post = head.next;
//        while (post != null) {
//            cur.next = cur.last;
//            cur.last = post;
//            cur = post;
//            post = post.next;
//        }
//        head = cur;

    }

}
