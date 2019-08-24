package chapter1.issue10.solution;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 最大值减最小值小于或等于 num 的子数组数量
 */
public class MaxMinusMinLENum {

    private int[] arr;
    private int num;
    private int count;

    public MaxMinusMinLENum(int[] arr, int num) {
        this.arr = arr;
        this.num = num;
        this.count = -1;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
        process();
    }

    public void setNum(int num) {
        this.num = num;
        process();
    }

    public int getCount() {
        if (count < 0) {
            process();
        }
        return this.count;
    }

    private void process() {
        /**
         * 特殊情况：
         */
        if (this.arr == null || this.arr.length == 0 || this.num < 0) {
            this.count = 0;
            return;
        }
        this.count = 0;
        /**
         * 双端队列
         */
        Deque<Integer> qMax = new LinkedList<>();
        Deque<Integer> qMin = new LinkedList<>();
        /**
         * 动态窗口左边界 i
         */
        for (int i = 0, j = 0; i < this.arr.length; ++i) {
            /**
             * 动态窗口右边界 j
             */
            for (; j < this.arr.length; ++j) {
                /**
                 *
                 */
                while (!qMax.isEmpty() && this.arr[qMax.peekLast()] <= this.arr[j]) {
                    qMax.pollLast();
                }
                qMax.addLast(j);
                /**
                 *
                 */
                while (!qMin.isEmpty() && this.arr[qMin.peekLast()] >= this.arr[j]) {
                    qMin.pollLast();
                }
                qMin.addLast(j);
                /**
                 * 窗口数组不满足条件
                 */
                if (this.arr[qMax.getFirst()] - this.arr[qMin.getFirst()] > this.num) {
                    break;
                }
            }
            if (qMax.peekFirst() == i) {
                qMax.pollLast();
            }
            if (qMin.peekFirst() == i) {
                qMin.pollFirst();
            }
            this.count += j - i;
        }
    }

}
