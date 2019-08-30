package 剑指Offer.issue13;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution {
    public void reOrderArray(int [] array) {
        Queue<Integer> oddQ = new LinkedList<>();
        Queue<Integer> evenQ = new LinkedList<>();
        for (int i = 0; i < array.length; ++i) {
            if ((array[i] & 1) == 1) {
                oddQ.add(array[i]);
            } else {
                evenQ.add(array[i]);
            }
        }
        int i = 0;
        while (!oddQ.isEmpty()) {
            array[i++] = oddQ.poll();
        }
        while (!evenQ.isEmpty()) {
            array[i++] = evenQ.poll();
        }
    }

}
