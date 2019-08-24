package chapter1.issue9.test;

import chapter1.issue9.solution.Matrix;

public class MatrixTest {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 0, 1, 1},
                {0, 1, 0, 1},
                {1, 1, 1, 0},
        };
        Matrix map = new Matrix(arr);
        int size = map.getMaxSubMatrixSize();
        System.out.println(size);
    }

}
