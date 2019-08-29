package chapter2.issue2.test;

import chapter2.issue2.solution.RemoveDoubleLinkedListLastKthNode;
import chapter2.issue2.solution.RemoveSingleLinkedListLastKthNode;

public class Test {

    private RemoveSingleLinkedListLastKthNode singleLinkedList;
    private RemoveDoubleLinkedListLastKthNode doubleLinkedList;

    public Test(int[] arr) {
        this.singleLinkedList = new RemoveSingleLinkedListLastKthNode(arr);
        this.doubleLinkedList = new RemoveDoubleLinkedListLastKthNode(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Test test = new Test(arr);
        test.singleLinkedList.removeSingleLinkedListLastKthNode(3);
        test.doubleLinkedList.removeDoubleLinkedListLastKthNode(3);

    }

}
