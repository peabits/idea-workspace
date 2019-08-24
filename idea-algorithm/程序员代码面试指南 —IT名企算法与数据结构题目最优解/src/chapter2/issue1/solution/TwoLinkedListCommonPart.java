package chapter2.issue1.solution;

import java.util.ArrayList;
import java.util.List;

public class TwoLinkedListCommonPart {

    private static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head1;
    private Node head2;
    private List<Integer> common;

    public TwoLinkedListCommonPart(int[] arr1, int[] arr2) {
        build(arr1, arr2);
    }

    private void build(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0) {
            this.head1 = null;
        } else {
            this.head1 = new Node(arr1[0]);
            Node head = head1;
            for (int i = 1; i < arr1.length; ++i) {
                head = head.next = new Node(arr1[i]);
            }
        }
        if (arr2 == null || arr2.length == 0) {
            this.head2 = null;
        } else {
            this.head2 = new Node(arr2[0]);
            Node head = head2;
            for (int i = 1; i < arr2.length; ++i) {
                head = head.next = new Node(arr2[i]);
            }
        }
    }

    public List<Integer> getCommon() {
        if (this.common == null) {
            calculate();
        }
        return this.common;
    }

    private void calculate() {
        this.common = new ArrayList<>();
        Node head1 = this.head1;
        Node head2 = this.head2;
        while (head1 != null && head2 != null) {
            if (head1.value > head2.value) {
                head1 = head1.next;
            } else if (head1.value < head2.value) {
                head2 = head2.next;
            } else {
                common.add(head1.value);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }

}
