package chapter2.issue2.solution;

public class RemoveSingleLinkedListLastKthNode {

    private static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public RemoveSingleLinkedListLastKthNode(int[] arr) {
        buildSingleLinkedList(arr);
    }

    private void buildSingleLinkedList(int[] arr) {
        if (arr != null && arr.length != 0) {
            Node preNode = this.head = new Node(arr[0]);
            for (int i : arr) {
                preNode = preNode.next = new Node(i);
            }
        }
    }

    public void removeSingleLinkedListLastKthNode(int lastKth) {
        if (this.head == null || lastKth < 1) {
            return;
        }
        Node curNode = this.head;
        while (curNode != null) {
            --lastKth;
            curNode = curNode.next;
        }
        /**
         *
         */
        if (lastKth == 0) {
            this.head = this.head.next;
        } else if (lastKth < 0) {
            curNode = this.head;
            while (++lastKth != 0) {
                curNode = curNode.next;
            }
            curNode.next = curNode.next.next;
        } else {
            // 超出范围
        }

    }

}
