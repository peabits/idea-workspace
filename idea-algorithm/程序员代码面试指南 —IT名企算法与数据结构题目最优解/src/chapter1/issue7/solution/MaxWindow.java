package chapter1.issue7.solution;

import java.util.Deque;
import java.util.LinkedList;

public class MaxWindow {

    private int[] arr;
    private int window;
    private int[] res;

    public MaxWindow() {
    }

    public MaxWindow(int[] arr, int window) {
        this.arr = arr;
        this.window = window;
    }

    public void setArrAndWindow(int[] arr, int window) {
        this.arr = arr;
        this.window = window;
        calculate();
    }

    public int[] getRes() {
        if (this.res == null) {
            calculate();
        }
        return this.res;
    }

    private void calculate() {
        /**
         * 窗口大小小于 1 or 数组为空 or 数组长度小于窗口长度 => 无结果
         */
        if (this.window < 1 || this.arr == null || this.arr.length < this.window) {
            return;
        }
        /**
         * 辅助双端队列
         */
        Deque<Integer> deque = new LinkedList<>();
        /**
         * 窗口最大值数组
         */
        this.res = new int[this.arr.length - this.window + 1];
        for (int i = 0, index = 0; i < this.arr.length; ++i) {
            /**
             * 队列不为空 and 队尾不大于下一个 => 队尾出队
             * util 队列为空 or 队尾大于下一个
             */
            while (!deque.isEmpty() && this.arr[deque.peekLast()] <= this.arr[i]) {
                deque.pollLast();
            }
            /**
             * 下一个入队
             */
            deque.addLast(i);
            /**
             * 队首处于窗口左边界外 => 队首出队
             */
            if (deque.peekFirst() == i - this.window) {
                deque.pollFirst();
            }
            /**
             * 窗口右边界达到窗口大小 => 当前窗口最大值即为队首
             */
            if (i >= this.window - 1) {
                this.res[index++] = this.arr[deque.peekFirst()];
            }
        }

    }

}
