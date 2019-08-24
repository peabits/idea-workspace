package chapter1.issue8.test;

import chapter1.issue8.solution.MaxTree;

public class MaxTreeTest {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        MaxTree maxTree = new MaxTree(arr);
        maxTree.getMaxTree();
    }

}
