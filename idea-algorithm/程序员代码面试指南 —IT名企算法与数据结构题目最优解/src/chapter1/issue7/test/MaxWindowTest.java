package chapter1.issue7.test;

import chapter1.issue7.solution.MaxWindow;

public class MaxWindowTest {

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 4, 3, 3, 6, 7};
        int window = 3;
        MaxWindow maxWindow = new MaxWindow(arr, window);
        maxWindow.getRes();
    }

}
