package chapter2.issue3.solution;

public class RemoveByRatio {

    private static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public RemoveByRatio(int[] arr) {
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

    public void removeByRatio(int a, int b) {
        if (a < 1 || a > b) {
            return;
        }
        if (this.head == null || this.head.next == null) {
            return;
        }
        int n = 1;
        Node curNode = this.head;
        while (curNode != null) {
            ++n;
            curNode = curNode.next;
        }
        n = (int) Math.ceil((double) (a * n) / (double) b);
        if (n == 1) {
            this.head = this.head.next;
        } else if (n > 1) {
            curNode = this.head;
            while (--n != 1) {
                curNode = curNode.next;
            }
            curNode.next = curNode.next.next;
        }
    }

}
