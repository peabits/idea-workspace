package chapter2.issue2.solution;

public class RemoveDoubleLinkedListLastKthNode {

    private static class Node {
        public int value;

        public Node Last;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public RemoveDoubleLinkedListLastKthNode(int[] arr) {
        buildDoubleLinkedList(arr);
    }

    private void buildDoubleLinkedList(int[] arr) {
        if (arr != null && arr.length != 0) {
            Node preNode = this.head = new Node(arr[0]);

            for (int i : arr) {
                preNode.next = new Node(i);
                preNode.next.Last = preNode;
                preNode = preNode.next;
            }
        }

    }

    public void removeDoubleLinkedListLastKthNode(int lastKth) {
        if (this.head != null && lastKth >= 1) {
            Node curNode = this.head;
            while (curNode != null) {
                --lastKth;
                curNode = curNode.next;
            }
            if (lastKth == 0) {
                this.head = this.head.next;
                this.head.Last = null;
            } else if (lastKth < 0) {
                curNode = this.head;
                while (++lastKth != 0) {
                    curNode = curNode.next;
                }
                curNode.next = curNode.next.next;
                if (curNode.next != null) {
                    curNode.next.Last = curNode;
                }
            }

        }
    }

}
