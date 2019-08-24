package chapter1.issue9.solution;

import java.util.Stack;

public class Matrix {

    private int[][] matrix;
    private Integer maxSize;

    public Matrix(int[][] arr) {
        this.matrix = arr;
    }

    public void setMatrix(int[][] arr) {
        this.matrix = arr;
        compute();
    }

    public int getMaxSubMatrixSize() {
        if (this.maxSize == null) {
            compute();
        }
        return this.maxSize;
    }

    private void compute() {
        if (this.matrix == null || this.matrix.length == 0 || this.matrix[0].length == 0) {
            this.maxSize = 0;
            return;
        }
        int[] height = new int[this.matrix[0].length];
        for (int i = 0; i < this.matrix.length; ++i) {
            for (int j = 0; j < this.matrix[0].length; ++j) {
                height[j] = this.matrix[i][j] == 0 ? 0 : height[j] + 1;
            }
            maxSize(height);
        }

    }

    private void maxSize(int[] height) {
        if (height == null || height.length == 0) {
            return;
        }
        this.maxSize = 0;
        Stack<Integer> stack = new Stack<>();
        /**
         * 遍历 height 数组
         */
        for (int i = 0; i < height.length; ++i) {
            while (!stack.empty() && height[i] <= height[stack.peek()]) {
                int j = stack.pop();
                int k = stack.empty() ? -1 : stack.peek();
                int size = (i - k - 1) * height[j];
                if (size > this.maxSize) {
                    this.maxSize = size;
                }
            }
            stack.push(i);  // 索引
        }
        /**
         * 处理 height 数组遍历完后 stack 未空的情况
         */
        while (!stack.empty()) {
            int j = stack.pop();
            int k = stack.empty() ? -1 : stack.peek();
            int size = (height.length - k - 1) * height[j];
            if (size > this.maxSize) {
                this.maxSize = size;
            }
        }

        // for(int i = 0; i < height.length; i++) {
        //
        // }

    }

}
