package chapter2.issue4.test;

import chapter2.issue4.solution.ReverseDoubleLinkedList;
import chapter2.issue4.solution.ReverseSingleLinkedList;

public class Test {

    private ReverseSingleLinkedList singleLinkedList;
    private ReverseDoubleLinkedList doubleLinkedList;

    public Test(int[] arr) {
        this.singleLinkedList = new ReverseSingleLinkedList(arr);
        this.doubleLinkedList = new ReverseDoubleLinkedList(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Test test = new Test(arr);
        test.singleLinkedList.reverseSingleLinkedList();
        test.doubleLinkedList.reverseDoubleLinkedList();

    }

}
