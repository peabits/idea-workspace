package chapter1.issue10.test;

import chapter1.issue10.solution.MaxMinusMinLENum;

public class MaxMinusMinLENumTest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int num = 3;

        MaxMinusMinLENum instance = new MaxMinusMinLENum(arr, num);
        int count = instance.getCount();
        System.out.println(count);
    }

}
