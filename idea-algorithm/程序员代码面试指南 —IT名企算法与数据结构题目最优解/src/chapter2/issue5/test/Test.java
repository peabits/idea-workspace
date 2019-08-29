package chapter2.issue5.test;

import chapter2.issue5.solution.ReversePartLinkedList;

public class Test {

    private ReversePartLinkedList partLinkedList;

    public Test(int[] arr) {
        this.partLinkedList = new ReversePartLinkedList(arr);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Test test = new Test(arr);
        test.partLinkedList.reversePartLinkedList(2, 4);


    }

}
